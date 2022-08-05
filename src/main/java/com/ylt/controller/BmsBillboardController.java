package com.ylt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ylt.common.api.ApiResult;
import com.ylt.model.entity.BmsBillboard;
import com.ylt.service.IBmsBillboardService;

@RestController
@RequestMapping("/billboard")
public class BmsBillboardController extends BaseController{
	
	@Resource
	private IBmsBillboardService bmsBillboardService;
	
	@GetMapping("/show")
	public ApiResult<BmsBillboard> getNotices(){
		List<BmsBillboard> list = bmsBillboardService.list(new LambdaQueryWrapper<BmsBillboard>().eq(BmsBillboard::isShow ,true));
		return ApiResult.success(list.get(list.size()-1));
	}
}
