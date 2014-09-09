package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.ui.contact.SelectContactUI;
import java.lang.ref.WeakReference;

final class k
  implements View.OnClickListener
{
  k(j paramj)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent((Context)j.a(this.iWH).get(), SelectContactUI.class);
    localIntent.putExtra("Contact_GroupFilter_Type", "@micromsg.qq.com");
    localIntent.putExtra("List_Type", 10);
    localIntent.putExtra("received_card_name", j.b(this.iWH));
    localIntent.putExtra("recommend_friends", true);
    localIntent.putExtra("Need_Group_Item", false);
    ((Context)j.c(this.iWH).get()).startActivity(localIntent);
    bg.qW().px().eC(j.b(this.iWH));
    bg.qW().px().eC(j.d(this.iWH));
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = j.b(this.iWH);
    arrayOfObject[1] = Integer.valueOf(2);
    arrayOfObject[2] = Integer.valueOf(0);
    localn.d(11003, arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.k
 * JD-Core Version:    0.6.2
 */