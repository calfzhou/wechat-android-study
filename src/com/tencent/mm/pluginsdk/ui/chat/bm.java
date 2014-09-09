package com.tencent.mm.pluginsdk.ui.chat;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.aq.a;
import com.tencent.mm.compatible.g.g;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout;
import com.tencent.mm.pluginsdk.ui.bl;
import com.tencent.mm.sdk.platformtools.z;

public final class bm extends LinearLayout
{
  private Button gGv;
  private int hCH = a.fromDPToPix(getContext(), 215);
  private VoiceSearchLayout hFq;
  private Button hFr;
  private bq hFs;
  private bl hFt = new bp(this);
  private boolean hFu = true;

  public bm(Context paramContext)
  {
    super(paramContext);
    init();
  }

  @TargetApi(16)
  private void init()
  {
    z.d("!44@/B4Tb64lLpIbEKHKo7kTF7hRtkVut7/Dah097ExZqPw=", "init");
    View.inflate(getContext(), k.bpc, this);
    this.hFr = ((Button)findViewById(i.amS));
    this.gGv = ((Button)findViewById(i.aOl));
    this.hFr.setOnClickListener(new bn(this));
    this.gGv.setOnClickListener(new bo(this));
    if (g.cp(16))
    {
      findViewById(i.aWc).setBackground(null);
      return;
    }
    findViewById(i.aWc).setBackgroundDrawable(null);
  }

  public final void a(bq parambq)
  {
    this.hFs = parambq;
  }

  public final void aBl()
  {
    if (this.hFu)
    {
      this.hFu = false;
      View localView = findViewById(i.aVI);
      Object localObject = localView.getLayoutParams();
      int i = this.hCH;
      if (localObject == null)
        localObject = new LinearLayout.LayoutParams(-1, i);
      ((ViewGroup.LayoutParams)localObject).height = i;
      localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
  }

  public final void aCL()
  {
    if (this.hFq == null)
    {
      this.hFq = ((VoiceSearchLayout)findViewById(i.aWb));
      this.hFq.a(this.hFt);
      this.hFq.aAx();
      this.hFq.aAy();
    }
    this.hFq.mv(0);
  }

  public final void aCM()
  {
    ((View)this.gGv.getParent()).setVisibility(0);
  }

  public final void mU(int paramInt)
  {
    if (this.hCH != paramInt)
    {
      this.hCH = paramInt;
      this.hFu = true;
    }
  }

  public final void reset()
  {
    this.hFq.aAA();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.bm
 * JD-Core Version:    0.6.2
 */