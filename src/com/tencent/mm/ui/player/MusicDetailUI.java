package com.tencent.mm.ui.player;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.an;
import com.tencent.mm.model.ao;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.s;
import com.tencent.mm.protocal.a.acb;
import com.tencent.mm.protocal.a.rt;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.ap;

public class MusicDetailUI extends MMActivity
{
  private long cDM;
  private Button ekV;
  private ao fXP;
  private ImageView jKr;
  private TextView jKs;
  private acb jKt;

  protected final void DP()
  {
    oP(com.tencent.mm.n.bTp);
    a(new b(this));
    this.jKr = ((ImageView)findViewById(i.aDF));
    this.jKs = ((TextView)findViewById(i.aDE));
    if (bg.ii() != null)
    {
      this.jKs.setText(getString(com.tencent.mm.n.bTn) + getString(com.tencent.mm.n.bTo) + bg.ii().getTitle());
      if ((bg.ii().kQ() == null) || (bg.ii().kP() != 0))
        break label294;
      this.cDM = 0L;
    }
    try
    {
      this.cDM = Long.parseLong(bg.ii().kQ());
      label143: if (bg.qW().isSDCardAvailable())
      {
        Bitmap localBitmap4 = ap.yg().a(bg.ii().kp(), com.tencent.mm.aq.a.getDensity(this), false);
        if (localBitmap4 != null)
          this.jKr.setImageBitmap(localBitmap4);
      }
      while (true)
      {
        this.ekV = ((Button)findViewById(i.aDD));
        this.ekV.setOnClickListener(new c(this));
        if ((bg.ii() != null) && (this.fXP == null))
        {
          this.fXP = new d(this);
          bg.ii().a(this.fXP);
        }
        if ((com.tencent.mm.am.a.to("favorite")) && ((0L != this.cDM) || (this.jKt != null)))
          a(0, h.Yi, new e(this));
        return;
        label294: if ((bg.ii().kQ() != null) && (bg.ii().kP() == 5))
        {
          if (bg.qW().isSDCardAvailable())
          {
            Bitmap localBitmap3 = ap.yg().b(bg.ii().kp(), com.tencent.mm.aq.a.getDensity(this), false);
            if (localBitmap3 != null)
              this.jKr.setImageBitmap(localBitmap3);
          }
        }
        else if ((bg.ii().kQ() != null) && (bg.ii().kP() == 6))
        {
          if (bg.qW().isSDCardAvailable())
          {
            Bitmap localBitmap2 = ap.yg().b(bg.ii().kp(), com.tencent.mm.aq.a.getDensity(this), false);
            if (localBitmap2 != null)
              this.jKr.setImageBitmap(localBitmap2);
          }
        }
        else if ((bg.ii().kQ() == null) || (bg.ii().kP() != 4))
        {
          rt localrt = new rt();
          localrt.hPl = bg.ii().lj();
          localrt.ihJ = bg.ii().kS();
          localrt.ihK = bg.ii().kR();
          if (am.ayg() != null)
          {
            Bitmap localBitmap1 = am.ayg().a(localrt, this.jKr, hashCode());
            if (localBitmap1 == null)
            {
              am.ayg().W(this.jKr);
              am.ayg().c(localrt, this.jKr, hashCode());
            }
            else
            {
              this.jKr.setImageBitmap(localBitmap1);
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      break label143;
    }
  }

  protected final int getLayoutId()
  {
    return k.bjV;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
    bg.ii().c(this.fXP);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramInt == 1))
    {
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.player.MusicDetailUI
 * JD-Core Version:    0.6.2
 */