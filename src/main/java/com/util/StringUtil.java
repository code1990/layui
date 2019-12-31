package com.util;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
@Api(tags="小说信息接口")
public class StringUtil {

    /**
     * param id
     *
     * @return
     */
    @ApiOperation("添加小说信息")
    @RequestMapping
    public boolean isBlank() {
        return true;
    }
}
