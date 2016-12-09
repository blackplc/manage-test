package com.example.Repository;

import com.example.Model.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;

import java.util.List;

/**
 * Created by byhieg on 17/1/5.
 * Mail to byhieg@gmail.com
 */
public interface ApiRepository extends JpaRepository<Api,Long>{

    List<Api> findByMark(Integer apiId);
}
