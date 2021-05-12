package com.example.demo

import com.example.demo.dto.*
import com.example.demo.enum.CType
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
@CrossOrigin("http://localhost:4000")
class DemoApplication {
    @GetMapping("/getData")
    fun hello(): String? {
        val mapper = ObjectMapper()
        val element = listOf(
            Element(
                "9470797c-7cfb-4d6b-bd3c-18c10860b9de",
                CType.FOLDER,
                "文件夹",
                700,
                91,
                20,
                10,
                subItem = listOf(
                    Element(
                        "ca650a6d-91c0-4c3a-bedf-1efc7d3f7c28",
                        CType.COLOR_BLOCK,
                        "色块图",
                        700,
                        91,
                        20,
                        10,
                    ),
                    Element(
                        "60077213-79ce-4eea-8c8c-6101a393d4cd",
                        CType.FOLDER,
                        "文件夹",
                        700,
                        91,
                        20,
                        10,
                        subItem = listOf(
                            Element(
                                "ca53c183-1060-4dd7-9a96-08122f4bf764",
                                CType.GENERAL_TITLE,
                                "通用标题",
                                471,
                                50,
                                110,
                                30,
                                generalTitle = GeneralTitleDataType(
                                    "区域经济检测数据大屏",
                                    "微软雅黑",
                                    42
                                )
                            ),
                            Element(
                                "c00ea9c7-d25f-4616-bcab-84994aae9af3",
                                CType.SINGLE_IMAGE,
                                "单张图片",
                                75,
                                75,
                                30,
                                18,
                            ),
                        )
                    ),
                )
            ),
            Element(
                "a630ffdc-6212-4c28-ab68-57ce78235a0d",
                CType.FOLDER,
                "文件夹",
                700,
                91,
                20,
                10,
                subItem = listOf(
                    Element(
                        "2eaf0604-e69e-4b68-ae7a-83d937b9deac",
                        CType.COLOR_BLOCK,
                        "色块图",
                        200,
                        91,
                        800,
                        10,
                    ),
                    Element(
                        "d21f2597-4038-4c56-bd01-04e389b5beb1",
                        CType.DIGITAL_CARD_FLIPPER,
                        "数字翻牌器",
                        100,
                        70,
                        880,
                        20,
                        digitalCardFlipper = DigitalCardFlipperDateType(
                            content = "2984.10",
                            size = 16,
                            title = DigitalCardFlipperTitle(
                                content = "第一季度",
                            ),
                            suffix = DigitalCardFlipperSuffix("万")
                        )
                    ),
                )
            ),
            Element(
                "e487cbbf-0cf4-4187-bcd2-3bdf290c51ea",
                CType.FOLDER,
                "文件夹",
                700,
                91,
                20,
                10,
                subItem = listOf(
                    Element(
                        "3ba284e9-b10f-419c-ae59-4909f20f882c",
                        CType.COLOR_BLOCK,
                        "色块图",
                        200,
                        91,
                        1050,
                        10,
                    ),
                    Element(
                        "15a647b0-0215-4a8f-89d4-306636920a1a",
                        CType.DIGITAL_CARD_FLIPPER,
                        "数字翻牌器",
                        100,
                        70,
                        1130,
                        20,
                        digitalCardFlipper = DigitalCardFlipperDateType(
                            content = "2330.56",
                            size = 20,
                            title = DigitalCardFlipperTitle(
                                content = "第二季度",
                            ),
                            suffix = DigitalCardFlipperSuffix("万")
                        )
                    ),
                )
            ),
            Element(
                "97930bc7-ee7c-4206-b62d-5454c55a891c",
                CType.FOLDER,
                "文件夹",
                700,
                91,
                20,
                10,
                subItem = listOf(
                    Element(
                        "723a3878-9106-4422-9905-b2753f26cbdf",
                        CType.COLOR_BLOCK,
                        "色块图",
                        200,
                        91,
                        1300,
                        10,
                    ),
                    Element(
                        "5a7db49b-7898-4ebd-943a-ccf722cb7521",
                        CType.DIGITAL_CARD_FLIPPER,
                        "数字翻牌器",
                        100,
                        70,
                        1380,
                        20,
                        digitalCardFlipper = DigitalCardFlipperDateType(
                            content = "2278.42",
                            size = 24,
                            title = DigitalCardFlipperTitle(
                                content = "第三季度",
                                isTop = false,
                            ),
                            suffix = DigitalCardFlipperSuffix("万")
                        )
                    ),
                )
            ),
            Element(
                "5aaff28e-038e-4812-8760-37ac788d0ad3",
                CType.FOLDER,
                "文件夹",
                700,
                91,
                20,
                10,
                subItem = listOf(
                    Element(
                        "10cf2d03-0b07-4220-b33b-377817741bd5",
                        CType.COLOR_BLOCK,
                        "色块图",
                        200,
                        91,
                        1550,
                        10,
                    ),
                    Element(
                        "7c52dcff-4896-4636-8aa5-bbe5ab2db606",
                        CType.DIGITAL_CARD_FLIPPER,
                        "数字翻牌器",
                        100,
                        70,
                        1630,
                        20,
                        digitalCardFlipper = DigitalCardFlipperDateType(
                            content = "1920.78",
                            size = 28,
                            title = DigitalCardFlipperTitle(
                                content = "第四季度",
                            ),
                            suffix = DigitalCardFlipperSuffix("万")
                        )
                    ),
                )
            ),
            Element(
                "c3800696-3e47-4e07-b5f5-cfcaf4c98cc2",
                CType.FOLDER,
                "文件夹",
                700,
                91,
                20,
                10,
                subItem = listOf(
                    Element(
                        "95c4bd57-865b-4d79-ad62-fa2127e89f43",
                        CType.COLOR_BLOCK,
                        "色块图",
                        410,
                        310,
                        20,
                        120,
                    ),
                    Element(
                        "82e1752f-b2e8-4a10-a158-7c7733d26f86",
                        CType.BAR_WITH_BACKGROUND,
                        "折线柱图",
                        400,
                        300,
                        25,
                        125,
                    ),
                )
            ),
            Element(
                "f11c290b-dac0-4373-bb1c-57ebbbc55702",
                CType.FOLDER,
                "文件夹",
                700,
                91,
                20,
                10,
                subItem = listOf(
                    Element(
                        "72b68f85-58e7-4391-b5ce-f23141cde64d",
                        CType.COLOR_BLOCK,
                        "色块图",
                        410,
                        310,
                        20,
                        450,
                    ),
                    Element(
                        "53bcceab-54fa-43c6-9197-13af67bc1e9e",
                        CType.MULTIPLE_X_AXES,
                        "折线图",
                        400,
                        300,
                        25,
                        455,
                    ),
                )
            ),
            Element(
                "54ed2768-84bb-4ed2-b3e3-6336491e45b9",
                CType.BUS_LINE,
                "香港18区人口密度图",
                800,
                800,
                475,
                120,
            ),
            Element(
                "a25272b5-aa1a-40a7-a97f-8260e31b3498",
                CType.FOLDER,
                "文件夹",
                700,
                91,
                20,
                10,
                subItem = listOf(
                    Element(
                        "35cfcd69-3891-4712-8183-acc42797556a",
                        CType.COLOR_BLOCK,
                        "色块图",
                        410,
                        310,
                        1343,
                        120,
                    ),
                    Element(
                        "4356c5c8-cac9-40b1-880e-c3e790e8b3c0",
                        CType.DOUGHNUT_CHART_WITH_ROUNDED_CORNER,
                        "饼图",
                        400,
                        300,
                        1343,
                        135,
                    ),
                )
            ),
            Element(
                "3b7e1af8-b95e-4896-b67d-8a09ae01ff9f",
                CType.FOLDER,
                "文件夹",
                700,
                91,
                20,
                10,
                subItem = listOf(
                    Element(
                        "064f0f56-f2cd-44a4-aecb-194f60087a78",
                        CType.COLOR_BLOCK,
                        "色块图",
                        410,
                        310,
                        1343,
                        450,
                    ),
                    Element(
                        "8310c293-8bb3-4213-9c43-b394817013f8",
                        CType.BUBBLE_CHART,
                        "气泡图",
                        400,
                        300,
                        1350,
                        480,
                    ),
                )
            ),
        )
        return mapper.writeValueAsString(element)
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}