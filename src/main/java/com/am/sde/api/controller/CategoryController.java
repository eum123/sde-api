package com.am.sde.api.controller;

import com.am.sde.api.dto.Category;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api("카테고리 API")
public class CategoryController {

    /**
     * 카테고리 정보를 조회한다.
     *
     * @return Category
     * @throws Exception
     */
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success", response = Category.class)
    })
    @ApiOperation(value = "카테고리 정보 조회")
    @GetMapping(value = "/categoryList")
    public Category getCategoryList() {

        return null;
    }

    /**
     * 카테고리 정보를 insert.
     *
     * @return Category
     * @throws Exception
     */
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success", response = Category.class)
    })
    @ApiOperation(value = "카테고리 정보 추가")
    @GetMapping(value = "/insertCategory")
    public int insertCategory() {

        return 0;
    }

    /**
     * 카테고리 정보를 update.
     *
     * @return Category
     * @throws Exception
     */
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success", response = Category.class)
    })
    @ApiOperation(value = "카테고리 정보 수정")
    @GetMapping(value = "/updateCategory")
    public int updateCategory() {

        return 0;
    }

    /**
     * 카테고리 정보를 delete.
     *
     * @return Category
     * @throws Exception
     */
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success", response = Category.class)
    })
    @ApiOperation(value = "카테고리 정보 삭제")
    @GetMapping(value = "/deleteCategory")
    public int deleteCategory() {

        return 0;
    }
}
