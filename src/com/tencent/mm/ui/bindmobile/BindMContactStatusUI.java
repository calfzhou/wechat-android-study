package com.tencent.mm.ui.bindmobile;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.n;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.MMWizardActivity;

public class BindMContactStatusUI extends MMWizardActivity
{
  private Button efk;
  private ImageView iTn;
  private TextView iTo;

  protected final void DP()
  {
    this.iTn = ((ImageView)findViewById(i.aiQ));
    this.iTo = ((TextView)findViewById(i.aiM));
    this.efk = ((Button)findViewById(i.aiP));
    if (aa.wb() == com.tencent.mm.modelfriend.ab.dtS)
    {
      this.iTn.setImageResource(h.WW);
      String str = (String)bg.qW().oQ().get(6);
      if ((str == null) || (str.equals("")))
        str = (String)bg.qW().oQ().get(4097);
      this.iTo.setText(getString(n.bwB, new Object[] { str }));
    }
    while (true)
    {
      this.efk.setOnClickListener(new ab(this));
      return;
      this.iTn.setImageResource(h.WX);
      this.iTo.setText(n.bwK);
    }
  }

  protected final int getLayoutId()
  {
    return k.bbI;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.bwE);
    DP();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      aQl();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.BindMContactStatusUI
 * JD-Core Version:    0.6.2
 */