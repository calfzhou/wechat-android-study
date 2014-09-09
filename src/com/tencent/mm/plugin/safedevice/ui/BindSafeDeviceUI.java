package com.tencent.mm.plugin.safedevice.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.ui.MMWizardActivity;

public class BindSafeDeviceUI extends MMWizardActivity
{
  protected final void DP()
  {
    oP(n.cbx);
    a(new a(this));
    ((ImageView)findViewById(i.aNK)).setImageResource(h.QA);
    ((TextView)findViewById(i.aNL)).setText(n.cbD);
    ((TextView)findViewById(i.aSQ)).setText(n.cbE);
    findViewById(i.aSQ).setOnClickListener(new b(this));
  }

  protected final int getLayoutId()
  {
    return k.bmw;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.BindSafeDeviceUI
 * JD-Core Version:    0.6.2
 */