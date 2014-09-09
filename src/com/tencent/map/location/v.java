package com.tencent.map.location;

import android.content.Context;
import android.os.Message;
import android.telephony.TelephonyManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class v extends Thread
{
  private m LG = null;
  private q LW = null;
  private z Mg = null;

  v(s params, q paramq, m paramm, z paramz)
  {
    if (paramq != null)
      this.LW = ((q)paramq.clone());
    if (paramm != null)
      this.LG = ((m)paramm.clone());
    if (paramz != null)
      this.Mg = ((z)paramz.clone());
  }

  public final void run()
  {
    if (!s.gZ());
    try
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)s.k(this.Me).getSystemService("phone");
      s.c(this.Me, localTelephonyManager.getDeviceId());
      s.d(this.Me, localTelephonyManager.getSubscriberId());
      Pattern localPattern = Pattern.compile("[0-9a-zA-Z+-]*");
      s locals5 = this.Me;
      String str12;
      String str17;
      label122: String str13;
      label130: label150: String str16;
      label196: label204: String str14;
      label224: String str15;
      label270: label278: String str8;
      label302: String str9;
      label330: String str10;
      label358: String str11;
      label386: String str1;
      label416: String str2;
      String str3;
      if (s.l(this.Me) == null)
      {
        str12 = "";
        s.c(locals5, str12);
        if (!localPattern.matcher(s.l(this.Me)).matches())
          break label688;
        s locals10 = this.Me;
        if (s.l(this.Me) != null)
          break label676;
        str17 = "";
        s.c(locals10, str17);
        s locals6 = this.Me;
        if (s.m(this.Me) != null)
          break label701;
        str13 = "";
        s.d(locals6, str13);
        if (!localPattern.matcher(s.m(this.Me)).matches())
          break label725;
        s locals9 = this.Me;
        if (s.m(this.Me) != null)
          break label713;
        str16 = "";
        s.d(locals9, str16);
        s locals7 = this.Me;
        if (s.n(this.Me) != null)
          break label738;
        str14 = "";
        s.e(locals7, str14);
        if (!localPattern.matcher(s.n(this.Me)).matches())
          break label762;
        s locals8 = this.Me;
        if (s.n(this.Me) != null)
          break label750;
        str15 = "";
        s.e(locals8, str15);
        s.hc();
        s locals1 = this.Me;
        if (s.l(this.Me) != null)
          break label775;
        str8 = "";
        s.c(locals1, str8);
        s locals2 = this.Me;
        if (s.m(this.Me) != null)
          break label787;
        str9 = "";
        s.d(locals2, str9);
        s locals3 = this.Me;
        if (s.n(this.Me) != null)
          break label799;
        str10 = "";
        s.e(locals3, str10);
        s locals4 = this.Me;
        if (s.l(this.Me) != null)
          break label811;
        str11 = "0123456789ABCDEF";
        s.f(locals4, ac.Y(str11));
        if (s.o(this.Me) != 4)
          break label823;
        str1 = ab.b(this.Mg);
        str2 = ab.a(this.LG, s.p(this.Me).gY());
        str3 = ab.a(s.l(this.Me), s.m(this.Me), s.n(this.Me), s.q(this.Me), s.r(this.Me));
        if ((this.LW == null) || (!this.LW.gZ()))
          break label829;
      }
      label676: label688: label823: label829: for (String str4 = ab.b(this.LW); ; str4 = "{}")
      {
        String str5 = "{\"version\":\"1.9.7\",\"address\":" + s.s(this.Me);
        String str6 = str5 + ",\"source\":203,\"access_token\":\"" + s.t(this.Me) + "\",\"app_name\":\"" + s.u(this.Me) + "\",\"bearing\":1";
        String str7 = str6 + ",\"attribute\":" + str3 + ",\"location\":" + str4 + ",\"cells\":" + str2 + ",\"wifis\":" + str1 + "}";
        Message localMessage = s.d(this.Me).obtainMessage(16, str7);
        s.d(this.Me).sendMessage(localMessage);
        return;
        str12 = s.l(this.Me);
        break;
        str17 = s.l(this.Me);
        break label122;
        s.c(this.Me, "");
        break label130;
        label701: str13 = s.m(this.Me);
        break label150;
        label713: str16 = s.m(this.Me);
        break label196;
        label725: s.d(this.Me, "");
        break label204;
        label738: str14 = s.n(this.Me);
        break label224;
        label750: str15 = s.n(this.Me);
        break label270;
        label762: s.e(this.Me, "");
        break label278;
        str8 = s.l(this.Me);
        break label302;
        str9 = s.m(this.Me);
        break label330;
        str10 = s.n(this.Me);
        break label358;
        str11 = s.l(this.Me);
        break label386;
        str1 = "[]";
        break label416;
      }
    }
    catch (Exception localException)
    {
      label775: label787: label799: label811: break label278;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.v
 * JD-Core Version:    0.6.2
 */