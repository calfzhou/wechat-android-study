package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.sdk.platformtools.z;

final class ab
  implements View.OnClickListener
{
  ab(aa paramaa, ae paramae)
  {
  }

  public final void onClick(View paramView)
  {
    switch (ad.jya[this.jxY.ordinal()])
    {
    default:
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.jxY;
      z.e("!56@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P+X69o6YV7p+XdPoFV/Hyaw==", "[cpan] unknow type for click. type:%s", arrayOfObject);
      return;
    case 1:
      Intent localIntent2 = new Intent();
      localIntent2.setClass(aa.a(this.jxZ), ChatroomContactUI.class);
      aa.a(this.jxZ).startActivity(localIntent2);
      return;
    case 2:
    }
    Intent localIntent1 = new Intent();
    a.b(aa.a(this.jxZ), "label", ".ui.ContactLabelManagerUI", localIntent1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ab
 * JD-Core Version:    0.6.2
 */