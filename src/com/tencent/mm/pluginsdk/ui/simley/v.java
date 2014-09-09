package com.tencent.mm.pluginsdk.ui.simley;

import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.mm.h;
import com.tencent.mm.n;
import com.tencent.mm.o;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.MMRadioImageButton;

public final class v
{
  private static ImageView a(ImageView paramImageView, i parami)
  {
    paramImageView.setMaxHeight(parami.aDM());
    paramImageView.setMinimumHeight(parami.aDM());
    paramImageView.setMaxWidth(parami.aDL());
    paramImageView.setMinimumWidth(parami.aDL());
    paramImageView.setScaleType(ImageView.ScaleType.CENTER);
    paramImageView.setClickable(true);
    return paramImageView;
  }

  public static ImageView a(i parami, View.OnClickListener paramOnClickListener)
  {
    ImageView localImageView = new ImageView(parami.aDF());
    a(localImageView, parami);
    if (i.aDG())
      localImageView.setBackgroundResource(h.SS);
    while (true)
    {
      localImageView.setImageResource(h.UK);
      localImageView.setTag("TAG_STORE_TAB");
      localImageView.setOnClickListener(paramOnClickListener);
      return localImageView;
      localImageView.setBackgroundResource(h.SR);
    }
  }

  public static MMRadioImageButton a(ab paramab, i parami)
  {
    MMRadioImageButton localMMRadioImageButton = new MMRadioImageButton(parami.aDF(), null, o.cuD);
    a(localMMRadioImageButton, parami);
    localMMRadioImageButton.setBackgroundResource(h.SR);
    l locall = parami.a(localMMRadioImageButton, paramab);
    if (i.vP(paramab.field_productID) == m.hJk)
      if (!i.b(paramab))
        localMMRadioImageButton.setCheckable(false);
    while (true)
    {
      localMMRadioImageButton.setTag(paramab.field_productID);
      localMMRadioImageButton.setTag(n.bEO, paramab);
      localMMRadioImageButton.setClickable(true);
      localMMRadioImageButton.setId(i.al(localMMRadioImageButton));
      return localMMRadioImageButton;
      localMMRadioImageButton.setCheckable(true);
      continue;
      if ((locall != null) && (locall.resource != 0))
        localMMRadioImageButton.setImageResource(locall.resource);
    }
  }

  public static ImageButton b(i parami)
  {
    ImageButton localImageButton = new ImageButton(parami.aDF(), null, o.cuD);
    a(localImageButton, parami);
    localImageButton.setClickable(false);
    localImageButton.setVisibility(8);
    return localImageButton;
  }

  public static ImageView b(i parami, View.OnClickListener paramOnClickListener)
  {
    ImageView localImageView = new ImageView(parami.aDF());
    a(localImageView, parami);
    localImageView.setImageResource(h.UP);
    localImageView.setBackgroundResource(h.SR);
    localImageView.setTag("TAG_STORE_MANEGER_TAB");
    localImageView.setOnClickListener(paramOnClickListener);
    return localImageView;
  }

  public static MMRadioImageButton c(i parami)
  {
    MMRadioImageButton localMMRadioImageButton = new MMRadioImageButton(parami.aDF(), null, o.cuD);
    a(localMMRadioImageButton, parami);
    localMMRadioImageButton.setBackgroundResource(h.SR);
    localMMRadioImageButton.setImageResource(h.UN);
    localMMRadioImageButton.setTag("TAG_DEFAULT_TAB");
    localMMRadioImageButton.setId(i.al(localMMRadioImageButton));
    localMMRadioImageButton.setCheckable(true);
    return localMMRadioImageButton;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.simley.v
 * JD-Core Version:    0.6.2
 */