package com.tencent.mm.ui.setting;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.ui.base.preference.Preference;

public class AccountInfoPreference extends Preference
{
  private String accountName;
  private String cDi;
  private gc jKC = null;
  private SpannableString jLi;
  private int jLj;
  private View.OnClickListener jhU = null;

  public AccountInfoPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public AccountInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AccountInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(SpannableString paramSpannableString)
  {
    this.jLi = paramSpannableString;
  }

  public final void a(gc paramgc)
  {
    this.jKC = paramgc;
  }

  public final void le(String paramString)
  {
    this.cDi = paramString;
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    ImageView localImageView = (ImageView)paramView.findViewById(i.ahd);
    if ((this.cDi != null) && (localImageView != null))
      c.a(localImageView, this.cDi);
    TextView localTextView1 = (TextView)paramView.findViewById(i.aGl);
    Object localObject;
    TextView localTextView2;
    label139: TextView localTextView3;
    if ((this.cDi != null) && (localTextView1 != null))
    {
      if (this.jLi == null)
      {
        localObject = this.cDi;
        localTextView1.setText((CharSequence)localObject);
      }
    }
    else
    {
      localTextView2 = (TextView)paramView.findViewById(i.aUp);
      if ((this.accountName == null) || (localTextView2 == null))
        break label225;
      Resources localResources = paramView.getResources();
      int i = n.bsF;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.accountName;
      localTextView2.setText(localResources.getString(i, arrayOfObject));
      localTextView3 = (TextView)paramView.findViewById(i.aMm);
      if (localTextView3 != null)
      {
        if (this.jLj <= 99)
          break label240;
        localTextView3.setText(getContext().getString(n.csx));
        localTextView3.setBackgroundResource(h.acu);
        localTextView3.setVisibility(0);
      }
    }
    while (true)
    {
      ((ImageView)paramView.findViewById(i.aUr)).setOnClickListener(new a(this));
      return;
      localObject = this.jLi;
      break;
      label225: if (localTextView2 == null)
        break label139;
      localTextView2.setVisibility(8);
      break label139;
      label240: if (this.jLj > 0)
      {
        localTextView3.setText(this.jLj);
        localTextView3.setVisibility(0);
      }
      else
      {
        localTextView3.setVisibility(8);
      }
    }
  }

  public final void setAccountName(String paramString)
  {
    this.accountName = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.AccountInfoPreference
 * JD-Core Version:    0.6.2
 */