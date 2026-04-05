package com.nellac.onlinemail.member;

import com.nellac.onlinemail.member.entity.MemberLevelEntity;
import com.nellac.onlinemail.member.service.MemberLevelService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MemberApplication.class)
class MemberApplicationTests {

    @Autowired
    MemberLevelService memberLevelService;

    @Test
    void contextLoads() {

        MemberLevelEntity entity = new MemberLevelEntity();
        entity.setId(123456L);
        entity.setName("test member level name");

        memberLevelService.save(entity);

    }

}
