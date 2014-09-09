package com.tencent.mm.ui.setting;

import android.os.Bundle;
import android.text.Editable;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.tools.av;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.cu;
import com.tencent.mm.ui.widget.MMEditText;

public class SettingsModifyNameUI extends MMActivity
{
  private MMEditText jNz;

  protected final void DP()
  {
    oP(n.bmW);
    this.jNz = ((MMEditText)findViewById(i.aPl));
    this.jNz.setFilters(av.hLZ);
    MMEditText localMMEditText = this.jNz;
    localMMEditText.setText(com.tencent.mm.ar.b.e(this, (String)bg.qW().oQ().get(4), (int)this.jNz.getTextSize()));
    this.jNz.setSelection(this.jNz.getText().length());
    this.jNz.addTextChangedListener(new ds(this));
    a(0, getString(n.bud), new dt(this), cu.iMA);
    eB(false);
    a(new du(this));
  }

  protected final int getLayoutId()
  {
    return k.bmW;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsModifyNameUI
 * JD-Core Version:    0.6.2
 */