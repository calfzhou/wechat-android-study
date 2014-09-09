package com.tencent.mm.ui.bindqq;

import android.os.Bundle;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.ui.MMWizardActivity;

public class SuccUnbindQQ extends MMWizardActivity
{
  protected final void DP()
  {
    oP(n.cmM);
    a(0, getString(n.btB), new ag(this));
  }

  protected final int getLayoutId()
  {
    return k.boz;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  protected void onResume()
  {
    super.onResume();
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.SuccUnbindQQ
 * JD-Core Version:    0.6.2
 */