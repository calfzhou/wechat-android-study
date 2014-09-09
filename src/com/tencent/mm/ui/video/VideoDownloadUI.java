package com.tencent.mm.ui.video;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.ak.m;
import com.tencent.mm.ak.p;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.r;
import com.tencent.mm.ak.t;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.chatting.na;
import com.tencent.mm.ui.chatting.ne;

public class VideoDownloadUI extends MMActivity
  implements t
{
  private long cDM;
  private com.tencent.mm.sdk.c.g diB = new na(ne.jvt, this);
  private ProgressBar fJc;
  private TextView fJd;
  private TextView gNF;
  private TextView gNG;
  private String rI;

  protected final void DP()
  {
    this.gNF = ((TextView)findViewById(i.aUR));
    this.gNG = ((TextView)findViewById(i.aUO));
    this.fJd = ((TextView)findViewById(i.aUQ));
    q localq = m.AL().hY(this.rI);
    TextView localTextView = this.fJd;
    int i = com.tencent.mm.n.bKz;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(com.tencent.mm.ak.v.e(localq));
    localTextView.setText(getString(i, arrayOfObject));
    this.gNG.setText(ap.eY(localq.AU()));
    this.gNF.setText(ap.Z(localq.sp()));
    this.cDM = bg.qW().oV().q(localq.getUser(), localq.kl()).kk();
    a(new g(this));
    this.fJc = ((ProgressBar)findViewById(i.aUP));
    this.fJc.setProgress(com.tencent.mm.ak.v.e(localq));
  }

  public final void eX(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")));
    label13: q localq;
    boolean bool;
    do
    {
      int i;
      do
      {
        do
        {
          break label13;
          do
            return;
          while (!paramString.equals(this.rI));
          localq = m.AL().hY(paramString);
        }
        while (localq == null);
        i = com.tencent.mm.ak.v.e(localq);
        this.fJc.setProgress(i);
        TextView localTextView = this.fJd;
        int j = com.tencent.mm.n.bKz;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i);
        localTextView.setText(getString(j, arrayOfObject));
      }
      while ((i < this.fJc.getMax()) || (localq.getStatus() != 199));
      bool = p.hS(m.AL().ib(paramString));
      if ((localq.AX() != 0) || (bool))
        break;
    }
    while ((com.tencent.mm.compatible.c.v.dNG.dMU == 1) && (VideoPlayerUI.a(paramString, this, bool)));
    localIntent = new Intent();
    localIntent.putExtra("VideoRecorder_MsgId", this.cDM);
    localIntent.putExtra("VideoRecorder_VideoSize", localq.sp());
    localIntent.putExtra("VideoRecorder_VideoLength", localq.AU());
    localIntent.putExtra("VideoPlayer_File_nam", paramString);
    a(VideoPlayerUI.class, localIntent);
    while (VideoPlayerUI.a(paramString, this, bool))
    {
      Intent localIntent;
      finish();
      return;
    }
    e.a(this, com.tencent.mm.n.coa, com.tencent.mm.n.buo, new h(this));
  }

  protected final int getLayoutId()
  {
    return k.boV;
  }

  public final long kk()
  {
    return this.cDM;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.rI = getIntent().getStringExtra("file_name");
    DP();
    a.aGB().a("RevokeMsg", this.diB);
  }

  protected void onDestroy()
  {
    a.aGB().b("RevokeMsg", this.diB);
    super.onDestroy();
  }

  protected void onPause()
  {
    m.AL().a(this);
    super.onPause();
  }

  protected void onResume()
  {
    m.AL().a(this, Looper.getMainLooper());
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.VideoDownloadUI
 * JD-Core Version:    0.6.2
 */