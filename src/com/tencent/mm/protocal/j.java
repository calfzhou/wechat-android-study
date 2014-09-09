package com.tencent.mm.protocal;

public final class j
{
  private static String hNp = null;

  public static String aGQ()
  {
    return hNp;
  }

  public static String nt(int paramInt)
  {
    String str = "code=" + Integer.toHexString(paramInt) + ", status = " + paramInt;
    if ((paramInt & 0x1) != 0)
      str = str + ", open";
    if ((paramInt & 0x2) != 0)
      str = str + ", email-verified";
    if ((paramInt & 0x4) != 0)
      str = str + ", mobile-verified";
    if ((paramInt & 0x8) != 0)
      str = str + ", hide-qq-search";
    if ((paramInt & 0x10) != 0)
      str = str + ", hide-qq-promote";
    if ((paramInt & 0x20) != 0)
      str = str + ", need-verify";
    if ((paramInt & 0x40) != 0)
      str = str + ", has-qq-msg";
    if ((paramInt & 0x80) != 0)
      str = str + ", no-qq-promote";
    if ((paramInt & 0x100) != 0)
      str = str + ", no-mobile-promote";
    if ((paramInt & 0x200) != 0)
      str = str + ", hide-mobile_search";
    if ((paramInt & 0x1000) != 0)
      str = str + ", open-float-bottle";
    if ((0x20000 & paramInt) != 0)
      str = str + ", bind but not upload";
    return str;
  }

  public static String nu(int paramInt)
  {
    String str1 = "code=" + Integer.toHexString(paramInt) + ", pluginFlag = " + paramInt;
    String str2;
    String str3;
    label81: String str4;
    label108: String str5;
    label137: String str6;
    label166: String str7;
    label195: String str8;
    label224: String str9;
    label254: String str10;
    label284: String str11;
    label314: String str12;
    if ((paramInt & 0x1) != 0)
    {
      str2 = str1 + ", QQMAIL_UNINSTALL";
      if ((paramInt & 0x2) == 0)
        break label425;
      str3 = str2 + ", PM_UNINSTALL";
      if ((paramInt & 0x4) == 0)
        break label448;
      str4 = str3 + ", FM_UNINSTALL";
      if ((paramInt & 0x8) == 0)
        break label472;
      str5 = str4 + ", WEIBO_UNINSTALL";
      if ((paramInt & 0x10) == 0)
        break label497;
      str6 = str5 + ", MEDIANOTE_UNINSTALL";
      if ((paramInt & 0x20) == 0)
        break label522;
      str7 = str6 + ", QMSG_UNINSTALL";
      if ((paramInt & 0x40) == 0)
        break label547;
      str8 = str7 + ", BOTTLE_UNINSTALL";
      if ((paramInt & 0x80) == 0)
        break label572;
      str9 = str8 + ", QSYNC_UNISTALL";
      if ((paramInt & 0x100) == 0)
        break label597;
      str10 = str9 + ", SHAKE_UNISTALL";
      if ((paramInt & 0x200) == 0)
        break label622;
      str11 = str10 + ", LBS_UNISTALL";
      if ((paramInt & 0x400) == 0)
        break label647;
      str12 = str11 + ", BOTTLE_CHART_INSTALL";
      label344: if ((paramInt & 0x1000) == 0)
        break label672;
    }
    label522: label672: for (String str13 = str12 + ",CHECKQQF_UNINSTALL"; ; str13 = str12 + ",CHECKQQF_INSTALL")
    {
      if ((0x8000 & paramInt) == 0)
        break label697;
      return str13 + ",MM_FEEDSAPP_UNINSTALL";
      str2 = str1 + ", QQMAIL_INSTALL";
      break;
      label425: str3 = str2 + ", PM_INSTALL";
      break label81;
      label448: str4 = str3 + ", FM_INSTALL";
      break label108;
      label472: str5 = str4 + ", WEIBO_INSTALL";
      break label137;
      label497: str6 = str5 + ", MEDIANOTE_INSTALL";
      break label166;
      str7 = str6 + ", QMSG_INSTALL";
      break label195;
      label547: str8 = str7 + ", BOTTLE_INSTALL";
      break label224;
      label572: str9 = str8 + ", QSYNC_INSTALL";
      break label254;
      label597: str10 = str9 + ", SHAKE_INSTALL";
      break label284;
      label622: str11 = str10 + ", LBS_INSTALL";
      break label314;
      str12 = str11 + ", BOTTLE_CHART_INSTALL";
      break label344;
    }
    label647: label697: return str13 + ",MM_FEEDSAPP_INSTALL";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.j
 * JD-Core Version:    0.6.2
 */