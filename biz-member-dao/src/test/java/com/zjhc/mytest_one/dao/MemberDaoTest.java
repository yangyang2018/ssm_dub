package com.zjhc.mytest_one.dao;

import com.zjhc.mytest_one.model.MemberDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yangyang on 2017/10/15.
 */
@ContextConfiguration(locations = { "classpath*:META-INF/application-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class MemberDaoTest {

    @Resource
    private MemberDao memberDao;

    @Test
    public void findAllMember(){
        List<MemberDto> allMembers = memberDao.findAllMembers();

        for (MemberDto m : allMembers) {
            System.out.println(m);

        }
    }
}
