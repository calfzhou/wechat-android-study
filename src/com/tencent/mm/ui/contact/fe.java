package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class fe
  implements View.OnClickListener
{
  fe(SelectContactUI paramSelectContactUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.jBX, GroupCardSelectUI.class);
    this.jBX.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fe
 * JD-Core Version:    0.6.2
 */