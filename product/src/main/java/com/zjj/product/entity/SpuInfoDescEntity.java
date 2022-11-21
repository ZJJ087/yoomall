package com.zjj.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu信息介绍
 * 
 * @author zhangjiajun
 * @email 804530103@qq.com
 * @date 2022-11-21 21:20:35
 */
@Data
public class SpuInfoDescEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
		private Long spuId;
	/**
	 * 商品介绍
	 */
	private String decript;

}
