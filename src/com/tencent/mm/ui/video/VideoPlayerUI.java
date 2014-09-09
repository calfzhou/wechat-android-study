package com.tencent.mm.ui.video;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.mm.ak.r;
import com.tencent.mm.h;
import com.tencent.mm.model.aj;
import com.tencent.mm.model.an;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.VideoView;
import com.tencent.mm.ui.chatting.na;
import com.tencent.mm.ui.chatting.ne;

public class VideoPlayerUI extends MMActivity
{
  private long cDM;
  private String ddt;
  private g diB = new na(ne.jvu, this);
  private VideoView eSH = null;
  private ImageButton gNC = null;
  private TextView gNF;
  private TextView gNG;
  private TextView jZp;
  private ay jZq = new ay(new q(this), true);
  private int length;
  private String rI;
  private int size;

  public static boolean a(String paramString, Context paramContext, boolean paramBoolean)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW").addFlags(268435456);
    String str = com.tencent.mm.ak.m.AL().ib(paramString);
    Uri localUri = Uri.parse("file://" + str);
    if (paramBoolean)
      localIntent.setDataAndType(localUri, "video/quicktime");
    while (!ap.i(paramContext, localIntent))
    {
      return false;
      localIntent.setDataAndType(localUri, "video/*");
    }
    paramContext.startActivity(localIntent);
    return true;
  }

  private void aqi()
  {
    this.eSH.pause();
    this.gNC.setVisibility(0);
    this.jZq.aNu();
    getWindow().clearFlags(1024);
    aPQ();
  }

  protected final void DP()
  {
    oP(com.tencent.mm.n.cnW);
    this.cDM = getIntent().getLongExtra("VideoRecorder_MsgId", -1L);
    this.rI = getIntent().getExtras().getString("VideoPlayer_File_nam");
    this.size = getIntent().getIntExtra("VideoRecorder_VideoSize", 0);
    this.length = getIntent().getIntExtra("VideoRecorder_VideoLength", 0);
    this.ddt = com.tencent.mm.ak.m.AL().ib(this.rI);
    z.d("!44@/B4Tb64lLpKQpS0z/gOJ2bfBnybsu7j7FckA+6xANiE=", com.tencent.mm.compatible.g.k.nK() + " initView");
    this.gNC = ((ImageButton)findViewById(com.tencent.mm.i.aUY));
    this.gNC.setOnClickListener(new i(this));
    z.d("!44@/B4Tb64lLpKQpS0z/gOJ2bfBnybsu7j7FckA+6xANiE=", com.tencent.mm.compatible.g.k.nK() + " initView");
    this.eSH = ((VideoView)findViewById(com.tencent.mm.i.aVs));
    this.eSH.setOnErrorListener(new j(this));
    findViewById(com.tencent.mm.i.aVp).setOnClickListener(new k(this));
    z.d("!44@/B4Tb64lLpKQpS0z/gOJ2bfBnybsu7j7FckA+6xANiE=", com.tencent.mm.compatible.g.k.nK() + " initView :" + this.ddt);
    if (this.ddt != null)
    {
      this.eSH.stopPlayback();
      this.eSH.BT(this.ddt);
    }
    z.d("!44@/B4Tb64lLpKQpS0z/gOJ2bfBnybsu7j7FckA+6xANiE=", com.tencent.mm.compatible.g.k.nK() + " initView");
    this.eSH.setOnPreparedListener(new l(this));
    this.eSH.setOnCompletionListener(new m(this));
    a(0, h.WS, new n(this));
    a(new o(this));
    this.jZp = ((TextView)findViewById(com.tencent.mm.i.aVr));
    this.gNG = ((TextView)findViewById(com.tencent.mm.i.aVo));
    this.gNF = ((TextView)findViewById(com.tencent.mm.i.aVq));
  }

  protected final void P(View paramView)
  {
    ((ViewGroup)aPH().getParent()).removeView(aPH());
    ((ViewGroup)getWindow().getDecorView()).addView(aPH(), 0);
  }

  public void finish()
  {
    if (bg.ii() != null)
      bg.ii().resume();
    if (bg.ij() != null)
      bg.ij().kG();
    super.finish();
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.boZ;
  }

  public final long kk()
  {
    return this.cDM;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    aPP();
    DP();
    if (bg.ii() != null)
      bg.ii().pause();
    if (bg.ij() != null)
      bg.ij().kH();
    a.aGB().a("RevokeMsg", this.diB);
  }

  protected void onDestroy()
  {
    if (this.eSH.isPlaying())
      this.eSH.stopPlayback();
    this.jZq.aNu();
    a.aGB().b("RevokeMsg", this.diB);
    super.onDestroy();
  }

  protected void onPause()
  {
    aqi();
    super.onPause();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.VideoPlayerUI
 * JD-Core Version:    0.6.2
 */