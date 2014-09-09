package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class fj
  implements View.OnClickListener
{
  fj(SelectContactUI paramSelectContactUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.jBX, GroupCardSelectUI.class);
    localIntent.putExtra("group_select_type", true);
    localIntent.putExtra("group_select_need_result", true);
    this.jBX.startActivityForResult(localIntent, 4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fj
 * JD-Core Version:    0.6.2
 */