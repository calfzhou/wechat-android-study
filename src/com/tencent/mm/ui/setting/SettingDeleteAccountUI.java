package com.tencent.mm.ui.setting;

import android.os.Bundle;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.ui.MMActivity;

public class SettingDeleteAccountUI extends MMActivity
{
  protected final void DP()
  {
    a(new ag(this));
    ((TextView)findViewById(i.apz)).setOnClickListener(new ah(this));
  }

  protected final int getLayoutId()
  {
    return k.bmP;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.ceA);
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingDeleteAccountUI
 * JD-Core Version:    0.6.2
 */