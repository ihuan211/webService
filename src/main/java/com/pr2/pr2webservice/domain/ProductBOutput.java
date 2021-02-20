package com.pr2.pr2webservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductBOutput {
    private Long teamId;

    /** 生产数量 */
    private Long productQuantity;

    /** B品数量 */
    private Long productBQuantity;

    /** 返修率 */
    private Long repairRate;

    /** 铂金数 */
    private Long platinumCount;

    /** 报废数 */
    private Long scrapCount;

    private String teamName;
}
