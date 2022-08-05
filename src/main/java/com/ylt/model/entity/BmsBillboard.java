package com.ylt.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data								//auto generate getter and setter
@Builder							//base on builder mode, support chain operation when create new object instance
@Accessors(chain=true)				//base on builder mode, support chain operation when create new object instance
@TableName("bms_billboard")			//from mybatis, link to sql table name
@NoArgsConstructor					//auto generate constructor with no argument
@AllArgsConstructor					//auto generate constructor with all argument
public class BmsBillboard implements Serializable{
	private static final long serialVersionUID = 1L;
//	primary key
	@TableId(type=IdType.AUTO)		//link to sql table attribute
	private Integer id;
//	content board
	@TableField("content")
	private String content;
//	create_time
	@TableField(value="create_time",fill=FieldFill.INSERT) //initial value by insert time 
	private Date createTime;
//	1:showing 0:hide
	@Builder.Default
	@TableField("show")
	private boolean show = false;
}
