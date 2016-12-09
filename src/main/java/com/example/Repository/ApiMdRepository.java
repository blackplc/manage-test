package com.example.Repository;

import com.example.Model.ApiMd;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shiqifeng on 2017/1/5.
 * Mail byhieg@gmail.com
 */
public interface ApiMdRepository extends JpaRepository<ApiMd,Long>{

    ApiMd findByMark(Integer apiId);
}
