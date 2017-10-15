package com.zjhc.mytest_one.dao;

import com.zjhc.mytest_one.model.MemberDto;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by yangyang on 2017/10/15.
 */
@Repository
public interface MemberDao {

    List<MemberDto> findAllMembers();

}
