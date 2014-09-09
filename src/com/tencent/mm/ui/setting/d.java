package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.ab.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.cs;
import com.tencent.mm.o.ac;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.e;

final class d
  implements MenuItem.OnMenuItemClickListener
{
  d(EditSignatureUI paramEditSignatureUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    boolean bool = this.jLr.getIntent().getBooleanExtra("persist_signature", true);
    String str = EditSignatureUI.b(this.jLr).getText().toString().trim();
    if (bool)
    {
      cs localcs = cs.rQ();
      localcs.bh(str);
      com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(2, cs.a(localcs)));
      com.tencent.mm.model.bg.qX().d(new k(5));
    }
    while (true)
    {
      this.jLr.XF();
      this.jLr.finish();
      return true;
      com.tencent.mm.model.bg.qW().oQ().set(12291, str);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.d
 * JD-Core Version:    0.6.2
 */