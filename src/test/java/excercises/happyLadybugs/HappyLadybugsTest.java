package excercises.happyLadybugs;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Daniel Nacher
 * 2024-06-13
 */
public class HappyLadybugsTest {

    @Test
    public void test() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("RBY_YBR"));
    }

    @Test
    public void test2() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("X_Y__X"));
    }

    @Test
    public void test3() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("B_RRBR"));
    }

    @Test
    public void test4() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("__"));
    }

    @Test
    public void test5() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("AABBC"));
    }

    @Test
    public void test6() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("AABBC_C"));
    }

    @Test
    public void test7() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("DD__FQ_QQF"));
    }

    @Test
    public void test8() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("AABCBC"));
    }

    @Test
    public void test9() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("_"));
    }

    @Test
    public void test10() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("RBRB"));
    }

    @Test
    public void test11() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("RRRR"));
    }

    @Test
    public void test12() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("BBB"));
    }

    @Test
    public void test13() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("BBB_"));
    }

    @Test
    public void test14() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("_FWYSSENEDBO_KSEVUAB_WZ_GASASVEVS_O_NSVBYFNADE_WWVSBKAE_F_VAS_F_AAAEWBE_WEAEOAYV"));
    }

    @Test
    public void test15() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("ZBF_MIFUXJNQGQRFZVRQUFFFFNGFIBJ_XZVIRFGMJRJFVMNJMF"));
    }

    @Test
    public void test16() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("YFCA_NXMGJYYGCMMGGGXYNAMFNJJX_"));
    }

    @Test
    public void test17() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("CBLJUKUWSTIIUKUBQSITSULTJKCUSKBCKB"));
    }

    @Test
    public void test18() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("A_TOJRPRW__JOJP__WAJT"));
    }

    @Test
    public void test19() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("E__TZJTD_OYGFM__QKZD_LJL_TJ_YED__DETFFYGJQ_T_JJZDJFMQO___T_JTQGKDTT_ET"));
    }

    @Test
    public void test20() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("_PMBBIK_THVEQPN_RHSUP__BI_R_HP_PTEHPRHBKVBN_SQKNB_NVRB_PMBUNT"));
    }

    @Test
    public void test21() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("Q_ZEUKWDG_Q_VEE_Z_PDDDEEP_PVDVVGZUEU_Q_"));
    }

    @Test
    public void test22() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("__MY_T_C_FY_USSALD_U_AIEJRPVNUA_TI_CAYTE__EPI_FDLMA_U_CC_AAUAVNUSJYAUD_AP_CIA_D_E__TAUSU_N"));
    }

    @Test
    public void test23() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("LXA__KNR_R___CJJLF_IJPFLRM__V_FAAN_JU__RJ__RFMJ_PP_L__R_RR___AJLJ_LKIAP_LX___L_FACFJXRC_L"));
    }

    @Test
    public void test24() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("I_S_AHBBZJLQDKQZXIG_TOC_BGQMQVTEWAAWIBL_MKJQQGSZIBWSQQ__K_HEHZZZG_BBCEJOWIGCGQTBQ_Z_DHGAIQ_____LVA_"));
    }

    @Test
    public void test25() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("OADXPZXDAXXPDOPBPB"));
    }

    @Test
    public void test26() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("IIIAA"));
    }

    @Test
    public void test27() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("G"));
    }

    @Test
    public void test28() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("GR"));
    }

    @Test
    public void test29() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("_GR_"));
    }

    @Test
    public void test30() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("_R_G_"));
    }

    @Test
    public void test31() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("R_R_R"));
    }

    @Test
    public void test32() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("RRGGBBXX"));
    }

    @Test
    public void test33() {
        assertEquals("NO", HappyLadybugs.happyLadybugs("RRGGBBXY"));
    }

}

