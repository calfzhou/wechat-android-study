package com.tencent.mm.ui.setting;

import android.os.Bundle;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.ui.MMActivity;

public class SettingDeleteAccountInputPassUI extends MMActivity
{
  protected final void DP()
  {
    a(new ae(this));
    a(0, getString(n.btB), new af(this));
  }

  protected final int getLayoutId()
  {
    return k.bmR;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.ceA);
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingDeleteAccountInputPassUI
 * JD-Core Version:    0.6.2
 */