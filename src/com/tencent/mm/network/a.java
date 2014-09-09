package com.tencent.mm.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Map;

public final class a extends p
  implements n
{
  private String dSM;
  private String dSN;
  private String dSO;
  private b dSP = null;
  private String dSQ;
  private Map dSR = new HashMap();
  private byte[] dpA;
  private int uin;
  private String username;

  public a(b paramb)
  {
    this.dSP = paramb;
    CR();
  }

  private void CR()
  {
    this.dpA = ch.jg(ak.getContext().getSharedPreferences("server_id_prefs", 0).getString("server_id", ""));
  }

  public final boolean CS()
  {
    return (this.dSO != null) && (this.dSO.length() > 0);
  }

  public final void e(String paramString1, String paramString2, String paramString3)
  {
    this.username = paramString1;
    this.dSM = paramString2;
    this.dSN = paramString3;
  }

  public final void g(String paramString, byte[] paramArrayOfByte)
  {
    this.dSR.put(paramString, paramArrayOfByte);
  }

  public final String getPassword()
  {
    return this.dSM;
  }

  public final String getUsername()
  {
    return this.username;
  }

  public final byte[] jl(String paramString)
  {
    return (byte[])this.dSR.get(paramString);
  }

  public final void jq(String paramString)
  {
    this.dSQ = paramString;
  }

  public final void l(String paramString, int paramInt)
  {
    this.dSO = paramString;
    this.uin = paramInt;
    if ((this.dSP != null) && (CS()));
    z.d("!32@/B4Tb64lLpLEGVwVFEpAHtYagi0L0qIw", "update session info: session=" + paramString + ", uin=" + paramInt);
  }

  public final int oD()
  {
    return this.uin;
  }

  public final String qL()
  {
    return this.dSO;
  }

  public final void reset()
  {
    z.i("!32@/B4Tb64lLpLEGVwVFEpAHtYagi0L0qIw", "reset accinfo");
    this.username = "";
    this.dSM = "";
    this.dSN = "";
    this.dSO = "";
    CR();
    this.uin = 0;
  }

  public final byte[] tC()
  {
    return this.dpA;
  }

  public final String tL()
  {
    return this.dSN;
  }

  public final String tV()
  {
    return this.dSQ;
  }

  public final String toString()
  {
    String str1 = "AccInfo:\n" + "|-uin     =" + oD() + "\n";
    String str2 = str1 + "|-user    =" + getUsername() + "\n";
    String str3 = str2 + "|-session =" + qL() + "\n";
    return str3 + "`-cookie  =" + ch.cF(tC());
  }

  public final void y(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    for (String str = ""; ; str = ch.cH(paramArrayOfByte))
    {
      ak.getContext().getSharedPreferences("server_id_prefs", 0).edit().putString("server_id", str).commit();
      this.dpA = paramArrayOfByte;
      z.i("!32@/B4Tb64lLpLEGVwVFEpAHtYagi0L0qIw", "oreh setCookie %s", new Object[] { str });
      z.appenderFlush();
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.a
 * JD-Core Version:    0.6.2
 */