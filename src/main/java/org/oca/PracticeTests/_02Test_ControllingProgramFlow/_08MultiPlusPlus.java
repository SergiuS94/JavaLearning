package org.oca.PracticeTests._02Test_ControllingProgramFlow;

public class _08MultiPlusPlus {

    public static void main(String[] args) {
        int plan = 1;
        plan = plan++ + --plan;
        System.out.println(plan);
        //deci, plan++ returneaza 1 si dupa modifica valoarea lui plan in 2
        //--plan modifica valoarea si dupa returneaza rezultatul din 2 in 1
        //astfel, rezultatul de la prima e 1 si se aduna cu 1 = 2
        plan = plan++ + ++plan;
//        plan = plan++ +++plan;nu va functiona, java by default cand vede mai multe plusuri le va grupa de la inceput cate doua
                                //pentru +++ plan ar reiesi ++ +plan unde ++ nu e legat de niciun operand, rezulta in eroare de compilare
    }

}
