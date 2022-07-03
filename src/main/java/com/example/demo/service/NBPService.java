package com.example.demo.service;

import com.example.demo.models.DbResponse;
import com.example.demo.models.NBPResponse;
import com.example.demo.repository.NBPRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NBPService {
    private final String url = "https://api.nbp.pl/api/exchangerates/tables/a/";
    private final RestTemplate restTemplate;
    private final NBPRepository nbpRepository;

    public NBPService(RestTemplate restTemplate, NBPRepository nbpRepository) {
        this.restTemplate = restTemplate;
        this.nbpRepository = nbpRepository;
    }

    public DbResponse midExchange(Double avg, String from, String to) {
        List<NBPResponse> res = restTemplate.getForObject(url + "{from}/{to}?format=json", List.class, from, to);


        long rates = res.stream().map(nr -> nr.getRates().stream().filter(i -> i.getMid() > avg)).count();

        Integer currNumber = (int) rates;


        DbResponse dbRes = new DbResponse(avg, currNumber, from, to);

        return nbpRepository.save(dbRes);
    }


}