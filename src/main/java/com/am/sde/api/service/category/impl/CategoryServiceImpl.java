package com.am.sde.api.service.category.impl;

import com.am.sde.api.dto.Category;
import com.am.sde.api.service.category.CategoryService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {

    @Override
    public List<Category> getCategoryList() {
        return null;
    }
}
