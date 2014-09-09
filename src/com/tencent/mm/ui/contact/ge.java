package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.u;

final class ge
  implements AdapterView.OnItemClickListener
{
  ge(SnsTagContactListUI paramSnsTagContactListUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Intent localIntent1 = new Intent();
    com.tencent.mm.g.a locala = (com.tencent.mm.g.a)SnsTagContactListUI.a(this.jCC).getItem(paramInt);
    u localu = am.ayl();
    if (localu == null)
    {
      this.jCC.finish();
      return;
    }
    Intent localIntent2 = localu.a(localIntent1, locala.getUsername());
    if (localIntent2 == null)
    {
      this.jCC.finish();
      return;
    }
    com.tencent.mm.am.a.b(this.jCC.aPI(), "sns", ".ui.SnsUserUI", localIntent2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ge
 * JD-Core Version:    0.6.2
 */