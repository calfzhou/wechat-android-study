package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;

final class cp
  implements View.OnClickListener
{
  cp(co paramco)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("enterprise_biz_name", co.a(this.jzO));
    a.b(paramView.getContext(), "brandservice", ".ui.EnterpriseBizListUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.cp
 * JD-Core Version:    0.6.2
 */