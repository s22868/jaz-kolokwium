package com.example.demo.api;

import com.example.demo.models.DbResponse;
import com.example.demo.service.NBPService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NBPRestController {
    private final NBPService nbpService;

    public NBPRestController(NBPService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping("/{avg}")
    @ApiOperation(value = "Wyświetlenie użytkownikowi ilości walut które przekraczają podany kurs biorąc pod uwagę dane z przedziału od YYYY-MM-DD do YYYY-MM-DD")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "avg", value = "Powyżej jakiego kursu ma zliczyć ", required = true, dataType = "string", paramType = "path", example = "2"),
            @ApiImplicitParam(name = "from", value = "Date od - YYYY-MM-DD", required = false, dataType = "string"),
            @ApiImplicitParam(name = "to", value = "Date do - YYYY-MM-DD", required = false, dataType = "string")

    })
    public ResponseEntity<DbResponse> testAdd(@PathVariable Double avg, @RequestParam(defaultValue = "2012-01-01") String from, @RequestParam(defaultValue = "2012-01-31") String to){
        return ResponseEntity.ok(nbpService.midExchange(avg, from, to));
    }

}
