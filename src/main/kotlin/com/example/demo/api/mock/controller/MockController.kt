package com.example.demo.api.mock.controller

import com.example.demo.api.mock.dto.PopulationAgeRate
import com.example.demo.api.mock.dto.PopulationCensus
import com.example.demo.api.mock.dto.PopulationNum
import com.example.demo.api.mock.dto.PopulationSex
import com.example.demo.api.mock.dto.common.Data
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

    @GetMapping("/getPopulationSexData")
    fun getPopulationSexData(): AppResponse<List<PopulationSex>> {
        return listOf(
            PopulationSex(
                year = "1953",
                data = listOf(
                    Data(
                        name = "????????????",
                        value = 33000
                    ),
                    Data(
                        name = "????????????",
                        value = 29000
                    )
                )
            ),
            PopulationSex(
                year = "1964",
                data = listOf(
                    Data(
                        name = "????????????",
                        value = 35000
                    ),
                    Data(
                        name = "????????????",
                        value = 34000
                    )
                )
            ),
            PopulationSex(
                year = "1982",
                data = listOf(
                    Data(
                        name = "????????????",
                        value = 52000
                    ),
                    Data(
                        name = "????????????",
                        value = 49000
                    )
                )
            ),
            PopulationSex(
                year = "1990",
                data = listOf(
                    Data(
                        name = "????????????",
                        value = 59000
                    ),
                    Data(
                        name = "????????????",
                        value = 55000
                    )
                )
            ),
            PopulationSex(
                year = "2000",
                data = listOf(
                    Data(
                        name = "????????????",
                        value = 67000
                    ),
                    Data(
                        name = "????????????",
                        value = 60000
                    )
                )
            ),
            PopulationSex(
                year = "2010",
                data = listOf(
                    Data(
                        name = "????????????",
                        value = 69000
                    ),
                    Data(
                        name = "????????????",
                        value = 65000
                    )
                )
            ),
            PopulationSex(
                year = "2020",
                data = listOf(
                    Data(
                        name = "????????????",
                        value = 72000
                    ),
                    Data(
                        name = "????????????",
                        value = 69000
                    )
                )
            ),
        ).successResult()
    }

    @GetMapping("/getPopulationAgeRate")
    fun getPopulationAgeRate(): AppResponse<PopulationAgeRate> {
        return PopulationAgeRate(
            name = "????????????",
            data = listOf(
                Data(
                    value = 253383938,
                    name = "0-14???",
                ),
                Data(
                    value = 894376020,
                    name = "15-59???",
                ),
                Data(
                    value = 264018766,
                    name = "60?????????",
                ),
            )
        ).successResult()
    }
}