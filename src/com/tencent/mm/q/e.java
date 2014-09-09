package com.tencent.mm.q;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;
import org.json.JSONObject;

public final class e
{
  private JSONObject dpM = null;
  private boolean dpN = true;
  private boolean dpO = false;
  private boolean dpP = false;
  private boolean dpQ = false;
  private String dpR;
  private String dpS;
  private List dpT = null;
  private j dpU = null;
  private g dpV = null;
  private k dpW = null;
  private i dpX = null;
  private boolean dpY = false;
  private boolean dpZ = false;
  private boolean dqa = false;
  private int dqb;
  private boolean dqc = false;
  private int dqd = 0;
  private int dqe = 0;
  private String dqf;
  private f dqg = null;
  private int dqh = 0;
  private int dqi = a.dpF;
  private String dqj;

  private static e fs(String paramString)
  {
    e locale = new e();
    if (ch.jb(paramString))
    {
      z.d("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "field_extinfo is null.");
      return locale;
    }
    try
    {
      long l = System.currentTimeMillis();
      locale.dpM = new JSONObject(paramString);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(System.currentTimeMillis() - l);
      z.d("!32@/B4Tb64lLpJBvWFKDfNn3dzjRXM90kQR", "parse extInfo:%d", arrayOfObject);
      return locale;
    }
    catch (Exception localException)
    {
    }
    return locale;
  }

  public final String uA()
  {
    if (this.dpM != null)
      this.dqf = this.dpM.optString("SupportEmoticonLinkPrefix");
    return this.dqf;
  }

  public final g uB()
  {
    if ((this.dpM != null) && (this.dpV == null))
    {
      String str = this.dpM.optString("MMBizMenu");
      if (str != null)
        this.dpV = g.fv(str);
    }
    return this.dpV;
  }

  public final String uC()
  {
    if (this.dpM != null)
      this.dqj = this.dpM.optString("ServicePhone");
    return this.dqj;
  }

  public final i uD()
  {
    if ((this.dpM != null) && (this.dpX == null))
    {
      String str = this.dpM.optString("EnterpriseBizInfo");
      if (str != null)
        this.dpX = i.fw(str);
    }
    return this.dpX;
  }

  public final boolean ud()
  {
    if (this.dpM != null)
    {
      int i = ch.getInt(this.dpM.optString("ReportLocationType"), 0);
      boolean bool = false;
      if (i > 0)
        bool = true;
      this.dpY = bool;
    }
    return this.dpY;
  }

  public final boolean uk()
  {
    if (this.dpM != null)
      this.dpO = "1".equals(this.dpM.optString("IsHideInputToolbarInMsg"));
    return this.dpO;
  }

  public final boolean ul()
  {
    if (this.dpM != null)
      this.dpP = "1".equals(this.dpM.optString("IsShowMember"));
    return this.dpP;
  }

  public final boolean um()
  {
    if (this.dpM != null)
      this.dqi = ch.getInt(this.dpM.optString("NotifyManage"), a.dpF);
    return this.dqi == a.dpE;
  }

  public final boolean un()
  {
    if (this.dpM != null)
      this.dpQ = "1".equals(this.dpM.optString("CanReceiveSpeexVoice"));
    return this.dpQ;
  }

  public final String uo()
  {
    if (this.dpM != null)
      this.dpR = this.dpM.optString("VerifyContactPromptTitle");
    return this.dpR;
  }

  public final String up()
  {
    if (this.dpM != null)
      this.dpS = this.dpM.optString("ConferenceContactExpireTime");
    return this.dpS;
  }

  public final List uq()
  {
    if ((this.dpM != null) && (this.dpT == null))
      this.dpT = l.c(this.dpM.optJSONArray("Privilege"));
    return this.dpT;
  }

  public final int ur()
  {
    if (this.dpM != null)
      this.dqb = this.dpM.optInt("ConnectorMsgType");
    return this.dqb;
  }

  public final boolean us()
  {
    int i = 1;
    if (this.dpM != null)
      if (this.dpM.optInt("AudioPlayType", 0) != i)
        break label33;
    while (true)
    {
      this.dqc = i;
      return this.dqc;
      label33: i = 0;
    }
  }

  public final int ut()
  {
    if (this.dpM != null)
      this.dqh = this.dpM.optInt("InteractiveMode");
    return this.dqh;
  }

  public final int uu()
  {
    if (this.dpM != null)
      this.dqd = this.dpM.optInt("ScanQRCodeType", 0);
    return this.dqd;
  }

  public final k uv()
  {
    if ((this.dpM != null) && (this.dpW == null))
      this.dpW = k.fy(this.dpM.optString("PayShowInfo"));
    return this.dpW;
  }

  public final f uw()
  {
    if ((this.dpM != null) && (this.dqg == null))
    {
      String str = this.dpM.optString("HardwareBizInfo");
      if (str != null)
        this.dqg = f.fu(str);
    }
    return this.dqg;
  }

  public final j ux()
  {
    if ((this.dpM != null) && (this.dpU == null))
      this.dpU = j.fx(this.dpM.optString("VerifySource"));
    return this.dpU;
  }

  public final boolean uy()
  {
    if (this.dpM != null)
    {
      int i = ch.getInt(this.dpM.optString("ReportLocationType"), 0);
      boolean bool = false;
      if (i == 2)
        bool = true;
      this.dpZ = bool;
    }
    return this.dpZ;
  }

  public final int uz()
  {
    if (this.dpM != null)
      this.dqe = this.dpM.optInt("ServiceType", 0);
    return this.dqe;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.e
 * JD-Core Version:    0.6.2
 */