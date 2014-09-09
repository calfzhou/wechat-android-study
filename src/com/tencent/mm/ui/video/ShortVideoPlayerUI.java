package com.tencent.mm.ui.video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.mm.ak.m;
import com.tencent.mm.ak.r;
import com.tencent.mm.i;
import com.tencent.mm.model.aj;
import com.tencent.mm.model.an;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.VideoView;

public class ShortVideoPlayerUI extends Activity
{
  private long cDM;
  private String ddt;
  private VideoView eSH = null;
  private String rI;

  public void finish()
  {
    if (bg.ii() != null)
      bg.ii().resume();
    if (bg.ij() != null)
      bg.ij().kG();
    super.finish();
    overridePendingTransition(0, 0);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(com.tencent.mm.k.cBE);
    this.cDM = getIntent().getLongExtra("VideoRecorder_MsgId", -1L);
    this.rI = getIntent().getExtras().getString("VideoPlayer_File_nam");
    this.ddt = m.AL().ib(this.rI);
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mCr1JvrFEaSDDrj8vIAwCCM=", com.tencent.mm.compatible.g.k.nK() + " initView: fullpath:" + this.ddt + ", filename:" + this.rI);
    this.eSH = ((VideoView)findViewById(i.aVs));
    this.eSH.setOnErrorListener(new a(this));
    findViewById(i.cAD).setOnClickListener(new b(this));
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mCr1JvrFEaSDDrj8vIAwCCM=", com.tencent.mm.compatible.g.k.nK() + " initView :" + this.ddt);
    if (this.ddt != null)
    {
      this.eSH.stopPlayback();
      this.eSH.BT(this.ddt);
    }
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mCr1JvrFEaSDDrj8vIAwCCM=", com.tencent.mm.compatible.g.k.nK() + " initView");
    this.eSH.setOnPreparedListener(new d(this));
    this.eSH.setOnCompletionListener(new e(this));
    if (bg.ii() != null)
      bg.ii().pause();
    if (bg.ij() != null)
      bg.ij().kH();
  }

  protected void onDestroy()
  {
    if (this.eSH.isPlaying())
      this.eSH.stopPlayback();
    super.onDestroy();
  }

  protected void onPause()
  {
    this.eSH.pause();
    super.onPause();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.ShortVideoPlayerUI
 * JD-Core Version:    0.6.2
 */