package io.github.hotspacode.neeza.sample.agent;


import io.github.hotspacode.neeza.sample.service.UserTest2;

public class AgentmainMain2 {
    public static void main(String[] args) throws InterruptedException {
        UserTest2 userTest2 = new UserTest2();
        for (; ; ) {
            System.out.println(userTest2.add());
            Thread.sleep(5000);
        }

    }
}
