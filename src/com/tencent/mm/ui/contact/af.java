package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;

final class af
  implements View.OnClickListener
{
  af(BizContactEntranceView paramBizContactEntranceView)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("intent_service_type", 251658241);
    a.b(paramView.getContext(), "brandservice", ".ui.BrandServiceIndexUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.af
 * JD-Core Version:    0.6.2
 */