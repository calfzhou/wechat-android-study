package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.ak.m;
import com.tencent.mm.ak.r;
import com.tencent.mm.c.a.aa;
import com.tencent.mm.i;
import com.tencent.mm.model.aj;
import com.tencent.mm.model.an;
import com.tencent.mm.model.bg;
import com.tencent.mm.o;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.VideoView;
import com.tencent.mm.ui.base.au;
import java.lang.ref.WeakReference;

public final class ox extends au
{
  private static pd jwz = new pd();
  private long cDM;
  private int cHH = 0;
  private String ddt;
  private int eOZ = 0;
  private VideoView eSH = null;
  private TextView jaO = null;
  private int jvZ = 0;
  private String rI;

  public ox(Context paramContext)
  {
    super(paramContext, o.cEI);
  }

  public final void dismiss()
  {
    z.d("!44@/B4Tb64lLpKYc17gQ4E+i2zzIzCJ7JpqKkNH7lU5Rrk=", "on dismiss");
    if (bg.ii() != null)
      bg.ii().resume();
    if (bg.ij() != null)
      bg.ij().kG();
    if (this.eSH != null)
    {
      this.eSH.stopPlayback();
      this.eSH.setOnErrorListener(null);
      this.eSH.setOnPreparedListener(null);
      this.eSH.setOnCompletionListener(null);
      findViewById(i.cAD).setOnClickListener(null);
    }
    if (isShowing())
    {
      aa localaa = new aa();
      localaa.cHD.type = 0;
      localaa.cHD.cHF = this.jvZ;
      localaa.cHD.cHG = this.eOZ;
      localaa.cHD.cHH = this.cHH;
      a.aGB().g(localaa);
    }
    a.aGB().b("RevokeMsg", jwz);
    super.dismiss();
  }

  public final void hT(String paramString)
  {
    this.rI = paramString;
  }

  public final void o(long paramLong)
  {
    this.cDM = paramLong;
  }

  protected final void onCreate(Bundle paramBundle)
  {
    long l = System.currentTimeMillis();
    z.d("!44@/B4Tb64lLpKYc17gQ4E+i2zzIzCJ7JpqKkNH7lU5Rrk=", l + " initView beg");
    super.onCreate(paramBundle);
    setContentView(com.tencent.mm.k.cBE);
    if (bg.ii() != null)
      bg.ii().pause();
    if (bg.ij() != null)
      bg.ij().kH();
    this.ddt = m.AL().ib(this.rI);
    z.d("!44@/B4Tb64lLpKYc17gQ4E+i2zzIzCJ7JpqKkNH7lU5Rrk=", com.tencent.mm.compatible.g.k.nK() + " initView: fullpath:" + this.ddt + ", filename:" + this.rI);
    this.jaO = ((TextView)findViewById(i.aSX));
    this.eSH = ((VideoView)findViewById(i.aVs));
    this.eSH.setOnErrorListener(new oy(this));
    findViewById(i.cAD).setOnClickListener(new oz(this));
    if (this.ddt != null)
    {
      this.eSH.stopPlayback();
      this.eSH.BT(this.ddt);
    }
    this.eSH.setOnPreparedListener(new pb(this));
    this.eSH.setOnCompletionListener(new pc(this));
    z.d("!44@/B4Tb64lLpKYc17gQ4E+i2zzIzCJ7JpqKkNH7lU5Rrk=", System.currentTimeMillis() - l + " initView end");
    aa localaa = new aa();
    localaa.cHD.type = 1;
    a.aGB().g(localaa);
    if (!a.aGB().c("RevokeMsg", jwz))
      a.aGB().a("RevokeMsg", jwz);
    jwz.jwC = new WeakReference(this);
  }

  public final void p(int paramInt1, int paramInt2, int paramInt3)
  {
    this.cHH = paramInt1;
    this.jvZ = paramInt2;
    this.eOZ = paramInt3;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ox
 * JD-Core Version:    0.6.2
 */