package Poker;

import java.util.*;

public class SendPokerTest {
    public static void main(String[] args) {
        //步骤一：买牌
        //1.1 定义一个双列集合，键：编号，值：具体的牌。规则：编号越小，牌越小
        Map<Integer,String> pokers = new HashMap<>();
        //1.2 定义一个单列集合，用来储存所有的牌的编号
        List<Integer> list = new ArrayList<>();
        //1.3 具体的买牌的动作
        //普通牌，52
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int num = 0;//表示牌的编号
        //通过循环嵌套造普通牌
        for (String number : numbers) {//外循环获取所有点数
            for (String color : colors) {//内循环获取所有花色
                String poker = number + color;
                //将牌的编号，具体的牌放到双列集合中
                pokers.put(num,poker);
                //将牌的编号放到单列集合中
                list.add(num);
                //每添加一张牌，编号要自增1
                num++;
            }
        }
        //大小王
        //添加小王
        pokers.put(num,"小王");
        list.add(num++);
        //添加大王
        pokers.put(num,"大王");
        list.add(num++);
        //打印所有牌
        System.out.println("所有的牌：" + pokers);
        System.out.println("所有的编号：" + list);

        //步骤二：洗牌
        Collections.shuffle(list);
        System.out.println("洗好牌后编号为：" + list);

        //步骤三：发牌
        //3.1 定义三个玩家集合和一个底牌集合
        List<Integer> gamer1 = new ArrayList<>();
        List<Integer> gamer2 = new ArrayList<>();
        List<Integer> gamer3 = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();
        //3.2 将索引和3取模，决定发给谁
        for (int i = 0; i < list.size(); i++) {
            //获取编号
            Integer pokerNum = list.get(i);
            if (i >= list.size() - 3) {
                //底牌
                dipai.add(pokerNum);
            } else if (i % 3 == 0) {
                gamer1.add(pokerNum);
            } else if (i % 3 == 1) {
                gamer2.add(pokerNum);
            } else  if (i % 3 == 2) {
                gamer3.add(pokerNum);
            }
        }
        //3.3 查看玩家、底牌的编号
        System.out.println("gamer1:" + gamer1);
        System.out.println("gamer2:" + gamer2);
        System.out.println("gamer3:" + gamer3);
        System.out.println("dipai:" + dipai);

        //步骤四：看牌
        System.out.println("----------------------------------------");
        System.out.println("gamer1:" + printPoker(gamer1,pokers));
        System.out.println("gamer2:" + printPoker(gamer2,pokers));
        System.out.println("gamer3:" + printPoker(gamer3,pokers));
        System.out.println("dipai:" + printPoker(dipai,pokers));
    }
    /*
    定义一个方法，用来看牌
    方法名：printPoker
    参数列表：List<Integer>,Nap<Integer,String>
    返回值：String
     */
    public static String printPoker(List<Integer> nums,Map<Integer,String> pokers) {
        //1.将牌的编号进行升序排列
        Collections.sort(nums);
        //2.遍历牌的编号集合，获取每一个编号
        StringBuilder sb = new StringBuilder();
        for (Integer num : nums) {
            //num就是要查找具体牌的编号
            //3.根据编号去双列集合查找该编号对应具体的牌
            String poker = pokers.get(num);
            //4.将获取的牌进行拼接
            sb.append(poker + " ");
        }
        //5.将最后拼接结果返回即可
        String str = sb.toString();
        return str.trim();
    }
}
