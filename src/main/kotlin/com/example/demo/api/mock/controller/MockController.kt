package com.example.demo.api.mock.controller

import com.example.demo.api.mock.dto.PopulationCensus
import com.example.demo.api.mock.dto.PopulationNum
import com.example.demo.base.dto.AppResponse
import com.example.demo.base.property.SystemConst
import com.example.demo.base.util.successResult
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
@RequestMapping(SystemConst.API_PREFIX + "/mock")
class MockController {

    @GetMapping("/getPopulationCensusData")
    fun getPopulationCensusData(): AppResponse<List<PopulationCensus>> {
        return listOf(
            PopulationCensus(
                year = "2020",
                data = PopulationNum(
                    total = 1411780000,
                    male = 723340000,
                    female = 688440000,
                    radio = 105.07,
                )
            ),
            PopulationCensus(
                year = "2010",
                data = PopulationNum(
                    total = 1332810869,
                    male = 682329104,
                    female = 650481765,
                    radio = 104.90,
                )
            ),
            PopulationCensus(
                year = "2000",
                data = PopulationNum(
                    total = 1242612226,
                    male = 640275969,
                    female = 602336257,
                    radio = 106.30,
                )
            ),
            PopulationCensus(
                year = "1990",
                data = PopulationNum(
                    total = 1160017381,
                    male = 584949922,
                    female = 548732579,
                    radio = 106.6,
                )
            ),
        ).successResult()
    }
}