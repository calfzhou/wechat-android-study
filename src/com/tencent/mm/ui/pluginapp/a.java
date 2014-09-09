package com.tencent.mm.ui.pluginapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

final class a
  implements View.OnClickListener
{
  a(AddFriendSearchPreference paramAddFriendSearchPreference)
  {
  }

  public final void onClick(View paramView)
  {
    if ((AddFriendSearchPreference.a(this.jKA) != null) && (AddFriendSearchPreference.b(this.jKA) != null))
    {
      if (AddFriendSearchPreference.b(this.jKA).getText() == null)
        AddFriendSearchPreference.a(this.jKA);
    }
    else
      return;
    AddFriendSearchPreference.a(this.jKA);
    AddFriendSearchPreference.b(this.jKA).getText().toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.a
 * JD-Core Version:    0.6.2
 */