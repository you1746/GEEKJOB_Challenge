/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 *
 * @author you
 */
public class Test1303 {
    public static void main(String[] arg){
        //DealerとUserのオブジェクトを作成
        Dealer master = new Dealer();
        User player = new User();
        
        //処理１：両者共にカードを２枚ずつ引き、手持ちに加える。なお、Dealerは１枚目を公開する。
        System.out.println("◆◆◆処理１（初回ドロー）◆◆◆");
        System.out.println("【プレイヤー】");
        player.setCard(master.deal());
        System.out.println("【ディーラー】");
        master.setCard(master.deal());
        master.openCard();
        
        //処理２：playerはヒットorスタンドを選択する。
        //処理２：playerのバスト判定
        System.out.println("◆◆◆処理２（プレイヤーのターン）◆◆◆");
        boolean check1 = true;          //true：stand、false：hit
        int i;

        //最大10回はループさせる。（回数はてきとー）
        for(i=0; i<10; i++){
            check1 = player.checkSum();
            if(check1 == true){
                //次の処理へ
                break;
            }
            else{
                //dealerは１枚引いて、playerの手札にする。
                player.setCard(master.hit());
            }
            
            if(player.checkBust() == true){
                System.out.println("ディーラーの勝ちです。。。");
                return;
            }
        }
            
        //処理３：dealerが17未満→ヒット、17以上→スタンドか判定
        //処理３：dealerのバスト判定
        System.out.println("◆◆◆処理３（ディーラーのターン）◆◆◆");
        boolean check2 = true;          //true：stand、false：hit
        int j;

        //最大10回はループさせる。（回数はてきとー）
        for(j=0; j<10; j++){
            check2 = master.checkSum();
            if(check2 == true){
                //次の処理へ
                break;
            }
            else{
                //dealerは１枚引いて、playerの手札にする。
                master.setCard(master.hit());
            }
            
            if(master.checkBust() == true){
                System.out.println("プレイヤーの勝利です！");
                return;
            }
        }
        
        //処理４：playerとdealerを比較し、結果発表。
        System.out.println("◆◆◆処理４（勝敗判定）◆◆◆");
        int sum1 = player.open();
        int sum2 = master.open();
        
        if(sum1 > sum2){
            System.out.println("プレイヤーの勝利です！・・・【sum1：" + sum1 + "、sum2：" + sum2 + "】");
        }
        else if(sum1 < sum2){
            System.out.println("ディーラーの勝ちです。。。・・・【sum1：" + sum1 + "、 sum2：" + sum2 + "】");
        }
        else{
            System.out.println("引き分けです。・・・【sum1：" + sum1 + " + sum2：" + sum2 + "】");
        }
        
        return;
    }
}

abstract class Human{
    //myCardsというArrayListの変数を用意してください。
    ArrayList <Integer> myCards = new ArrayList<Integer>();

    //openというabstractな公開メソッドを用意してください。※共通処理の為、Humanクラスに記述。
    //openは、myCardsのカードの合計値を返却するように実装してください。
    protected int open(){
        int sum = 0;
        for(Integer num: myCards){
            sum += num;
        }
        System.out.println("現在の合計値は、" + sum + "です。");
        
        return sum;
    }

    //setCardというArrayListを引数とした、abstractな公開メソッドを用意してください。※共通処理の為、Humanクラスに記述。
    //setCardは、ArrayListで受けたカード情報をmyCardsに追加するように実装してください。
    protected void setCard(ArrayList<Integer> myLists){
        for(Integer num: myLists){
            myCards.add(num);
        }
    }

    //checkSumというabstractな公開メソッドを用意してください。
    abstract protected boolean checkSum();
    
    //バスト判定：２２以上→true、２１以下→false
    protected boolean checkBust(){
        int sum = open();
        
        if(sum > 21){
            System.out.println("バストしました");
            return true;
        }
        else{
            return false;
        }
    }
}

class Dealer extends Human{
    ArrayList<Integer> cards = new ArrayList<Integer>();
    Random rand = new Random();

    //cardsというArrayListの変数を用意し、初期処理でこのcardsに全てのトランプを持たせてください。
    Dealer(){
        int i,j,k;
        //「A」は「1」として扱う。
        //「J・Q・K」は「10」として扱う。
        for(i=1; i<=13; i++){
            if(i>10){
                k = 10;
            }
            else{
                k = i;
            }
            for(j=1; j<=4; j++){
                this.cards.add(k);
//                System.out.println(((i-1)*4+j-1) + "番目のArrayListに" + k + "を格納。");
            }
        }
    }

    //dealという公開メソッドを用意し、cardsからランダムで2枚のカードをArrayListにして返却してください。
    ArrayList deal(){
        Integer data;
        Integer number;
        ArrayList<Integer> lists = new ArrayList<Integer>();

        //残カード枚数を上限として乱数を生成
        number = rand.nextInt(this.cards.size());
        
        //１枚目を引く（cardsから1枚引いて、myCardsへ加える。）
        data = this.cards.get(number);
        lists.add(data);
        this.cards.remove(number);
        System.out.print("初期カード１枚目：" + data + "　,２枚目：");

        //２枚目を引く（cardsから1枚引いて、myCardsへ加える。）
        data = this.cards.get(rand.nextInt(this.cards.size()));
        lists.add(data);
        this.cards.remove(number);
        System.out.println(data);

        //引いた２枚をArrayListとして返す
        return lists;
    }

    //hitという公開メソッドを用意し、cardsからランダムで1枚のカードをArrayListにして返却してください。
    ArrayList hit(){
        Integer data;
        Integer number;
        ArrayList<Integer> lists = new ArrayList<Integer>();

        //残カード枚数を上限として乱数を生成
        number = rand.nextInt(this.cards.size());
        
        //１枚目を引く（cardsから1枚引いて、myCardsへ加える。）
        data = this.cards.get(number);
        lists.add(data);
        this.cards.remove(number);
        System.out.println("追加カード：" + data);

        return lists;
    }
    
    //Dealerは初期２枚の１枚目を公開する
    void openCard(){
        System.out.println("１枚目オープン：" + myCards.get(0));
    }
    
    //checkSumは、myCardsを確認し、まだカードが必要ならtrue、必要無ければfalseを返却するように実装してください。
    protected boolean checkSum(){
        int sum = open();

        if(sum >= 17){  return true;    }
        else{           return false;   }
    }
}

class User extends Human{
    //checkSumは、myCardsを確認し、まだカードが必要ならtrue、必要無ければfalseを返却するように実装してください。
    protected boolean checkSum(){
        int sum = open();

        if(sum >= 17){  return true;    }
        else{           return false;   }
    }
}
