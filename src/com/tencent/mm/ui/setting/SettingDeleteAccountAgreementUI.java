package com.tencent.mm.ui.setting;

import android.os.Bundle;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.ui.MMActivity;

public class SettingDeleteAccountAgreementUI extends MMActivity
{
  protected final void DP()
  {
    TextView localTextView = (TextView)findViewById(i.aGg);
    localTextView.setOnClickListener(new ab(this));
    CheckedTextView localCheckedTextView = (CheckedTextView)findViewById(i.aeX);
    localCheckedTextView.setOnClickListener(new ac(this, localTextView, localCheckedTextView));
    localTextView.setEnabled(localCheckedTextView.isChecked());
    a(new ad(this));
  }

  protected final int getLayoutId()
  {
    return k.bmQ;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.ceA);
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingDeleteAccountAgreementUI
 * JD-Core Version:    0.6.2
 */