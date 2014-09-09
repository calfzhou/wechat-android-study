package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.widget.n;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

final class q extends n
  implements View.OnClickListener
{
  private SearchView Kc;
  private Context Kd;
  private int Ke;
  private ColorStateList Kf;
  private int Kg;
  private int Kh;
  private int Ki;
  private int Kj;
  private int Kk;
  private int Kl;
  private boolean mClosed;
  private SearchableInfo qP;
  private WeakHashMap qX;

  private static String a(Cursor paramCursor, int paramInt)
  {
    if (paramInt == -1)
      return null;
    try
    {
      String str = paramCursor.getString(paramInt);
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String a(Cursor paramCursor, String paramString)
  {
    return a(paramCursor, paramCursor.getColumnIndex(paramString));
  }

  private static void a(Cursor paramCursor)
  {
    if (paramCursor != null);
    for (Bundle localBundle = paramCursor.getExtras(); ; localBundle = null)
    {
      if ((localBundle != null) && (localBundle.getBoolean("in_progress")));
      return;
    }
  }

  private static void a(ImageView paramImageView, Drawable paramDrawable, int paramInt)
  {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null)
    {
      paramImageView.setVisibility(paramInt);
      return;
    }
    paramImageView.setVisibility(0);
    paramDrawable.setVisible(false, false);
    paramDrawable.setVisible(true, false);
  }

  private static void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence))
    {
      paramTextView.setVisibility(8);
      return;
    }
    paramTextView.setVisibility(0);
  }

  private void a(String paramString, Drawable paramDrawable)
  {
    if (paramDrawable != null)
      this.qX.put(paramString, paramDrawable.getConstantState());
  }

  private Drawable b(Uri paramUri)
  {
    try
    {
      boolean bool = "android.resource".equals(paramUri.getScheme());
      if (bool)
        try
        {
          Drawable localDrawable2 = c(paramUri);
          return localDrawable2;
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          throw new FileNotFoundException("Resource does not exist: " + paramUri);
        }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      new StringBuilder("Icon not found: ").append(paramUri).append(", ").append(localFileNotFoundException.getMessage());
      return null;
    }
    InputStream localInputStream = this.Kd.getContentResolver().openInputStream(paramUri);
    if (localInputStream == null)
      throw new FileNotFoundException("Failed to open " + paramUri);
    try
    {
      Drawable localDrawable1 = Drawable.createFromStream(localInputStream, null);
      try
      {
        localInputStream.close();
        return localDrawable1;
      }
      catch (IOException localIOException2)
      {
        new StringBuilder("Error closing icon stream for ").append(paramUri);
        return localDrawable1;
      }
    }
    finally
    {
    }
    try
    {
      localInputStream.close();
      throw localObject;
    }
    catch (IOException localIOException1)
    {
      while (true)
        new StringBuilder("Error closing icon stream for ").append(paramUri);
    }
  }

  private Drawable c(Uri paramUri)
  {
    String str = paramUri.getAuthority();
    if (TextUtils.isEmpty(str))
      throw new FileNotFoundException("No authority: " + paramUri);
    Resources localResources;
    List localList;
    try
    {
      localResources = this.mContext.getPackageManager().getResourcesForApplication(str);
      localList = paramUri.getPathSegments();
      if (localList == null)
        throw new FileNotFoundException("No path: " + paramUri);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new FileNotFoundException("No package found for authority: " + paramUri);
    }
    int i = localList.size();
    if (i == 1);
    int j;
    while (true)
    {
      try
      {
        int k = Integer.parseInt((String)localList.get(0));
        j = k;
        if (j != 0)
          break;
        throw new FileNotFoundException("No resource found for: " + paramUri);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new FileNotFoundException("Single path segment is not a resource ID: " + paramUri);
      }
      if (i == 2)
        j = localResources.getIdentifier((String)localList.get(1), (String)localList.get(0), str);
      else
        throw new FileNotFoundException("More than two path segments: " + paramUri);
    }
    return localResources.getDrawable(j);
  }

  private Drawable f(String paramString)
  {
    Drawable localDrawable1;
    if ((paramString == null) || (paramString.length() == 0) || ("0".equals(paramString)))
      localDrawable1 = null;
    while (true)
    {
      return localDrawable1;
      try
      {
        int i = Integer.parseInt(paramString);
        String str = "android.resource://" + this.Kd.getPackageName() + "/" + i;
        localDrawable1 = g(str);
        if (localDrawable1 == null)
        {
          Drawable localDrawable3 = this.Kd.getResources().getDrawable(i);
          a(str, localDrawable3);
          return localDrawable3;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localDrawable1 = g(paramString);
        if (localDrawable1 == null)
        {
          Drawable localDrawable2 = b(Uri.parse(paramString));
          a(paramString, localDrawable2);
          return localDrawable2;
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
      }
    }
    return null;
  }

  private Drawable g(String paramString)
  {
    Drawable.ConstantState localConstantState = (Drawable.ConstantState)this.qX.get(paramString);
    if (localConstantState == null)
      return null;
    return localConstantState.newDrawable();
  }

  private Drawable getActivityIcon(ComponentName paramComponentName)
  {
    PackageManager localPackageManager = this.mContext.getPackageManager();
    ActivityInfo localActivityInfo;
    int i;
    try
    {
      localActivityInfo = localPackageManager.getActivityInfo(paramComponentName, 128);
      i = localActivityInfo.getIconResource();
      if (i == 0)
        return null;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localNameNotFoundException.toString();
      return null;
    }
    Drawable localDrawable = localPackageManager.getDrawable(paramComponentName.getPackageName(), i, localActivityInfo.applicationInfo);
    if (localDrawable == null)
    {
      new StringBuilder("Invalid icon resource ").append(i).append(" for ").append(paramComponentName.flattenToShortString());
      return null;
    }
    return localDrawable;
  }

  public final void a(View paramView, Cursor paramCursor)
  {
    r localr = (r)paramView.getTag();
    if (this.Kl != -1);
    for (int i = paramCursor.getInt(this.Kl); ; i = 0)
    {
      if (localr.Km != null)
      {
        String str3 = a(paramCursor, this.Kg);
        a(localr.Km, str3);
      }
      Object localObject3;
      label204: Object localObject1;
      label237: ImageView localImageView1;
      Drawable localDrawable1;
      if (localr.Kn != null)
      {
        String str2 = a(paramCursor, this.Ki);
        if (str2 != null)
        {
          if (this.Kf == null)
          {
            TypedValue localTypedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(d.NJ, localTypedValue, true);
            this.Kf = this.mContext.getResources().getColorStateList(localTypedValue.resourceId);
          }
          SpannableString localSpannableString = new SpannableString(str2);
          localSpannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.Kf, null), 0, str2.length(), 33);
          localObject3 = localSpannableString;
          if (!TextUtils.isEmpty((CharSequence)localObject3))
            break label349;
          if (localr.Km != null)
          {
            localr.Km.setSingleLine(false);
            localr.Km.setMaxLines(2);
          }
          a(localr.Kn, (CharSequence)localObject3);
        }
      }
      else
      {
        if (localr.Ko != null)
        {
          ImageView localImageView2 = localr.Ko;
          if (this.Kj != -1)
            break label375;
          localObject1 = null;
          a(localImageView2, (Drawable)localObject1, 4);
        }
        if (localr.Kp != null)
        {
          localImageView1 = localr.Kp;
          int j = this.Kk;
          localDrawable1 = null;
          if (j != -1)
            break label528;
        }
      }
      while (true)
      {
        a(localImageView1, localDrawable1, 8);
        if ((this.Ke != 2) && ((this.Ke != 1) || ((i & 0x1) == 0)))
          break label547;
        localr.Kq.setVisibility(0);
        localr.Kq.setTag(localr.Km.getText());
        localr.Kq.setOnClickListener(this);
        return;
        localObject3 = a(paramCursor, this.Kh);
        break;
        label349: if (localr.Km == null)
          break label204;
        localr.Km.setSingleLine(true);
        localr.Km.setMaxLines(1);
        break label204;
        label375: localObject1 = f(paramCursor.getString(this.Kj));
        if (localObject1 != null)
          break label237;
        ComponentName localComponentName = this.qP.getSearchActivity();
        String str1 = localComponentName.flattenToShortString();
        if (this.qX.containsKey(str1))
        {
          Drawable.ConstantState localConstantState = (Drawable.ConstantState)this.qX.get(str1);
          if (localConstantState == null);
          for (localObject1 = null; ; localObject1 = localConstantState.newDrawable(this.Kd.getResources()))
          {
            label446: if (localObject1 != null)
              break label516;
            localObject1 = this.mContext.getPackageManager().getDefaultActivityIcon();
            break;
          }
        }
        Drawable localDrawable2 = getActivityIcon(localComponentName);
        if (localDrawable2 == null);
        for (Object localObject2 = null; ; localObject2 = localDrawable2.getConstantState())
        {
          this.qX.put(str1, localObject2);
          localObject1 = localDrawable2;
          break label446;
          label516: break;
        }
        label528: localDrawable1 = f(paramCursor.getString(this.Kk));
      }
      label547: localr.Kq.setVisibility(8);
      return;
    }
  }

  public final void changeCursor(Cursor paramCursor)
  {
    if (this.mClosed)
      if (paramCursor != null)
        paramCursor.close();
    while (true)
    {
      return;
      try
      {
        super.changeCursor(paramCursor);
        if (paramCursor != null)
        {
          this.Kg = paramCursor.getColumnIndex("suggest_text_1");
          this.Kh = paramCursor.getColumnIndex("suggest_text_2");
          this.Ki = paramCursor.getColumnIndex("suggest_text_2_url");
          this.Kj = paramCursor.getColumnIndex("suggest_icon_1");
          this.Kk = paramCursor.getColumnIndex("suggest_icon_2");
          this.Kl = paramCursor.getColumnIndex("suggest_flags");
          return;
        }
      }
      catch (Exception localException)
      {
      }
    }
  }

  public final CharSequence convertToString(Cursor paramCursor)
  {
    if (paramCursor == null);
    String str2;
    do
    {
      do
      {
        return null;
        String str1 = a(paramCursor, "suggest_intent_query");
        if (str1 != null)
          return str1;
        if (this.qP.shouldRewriteQueryFromData())
        {
          String str3 = a(paramCursor, "suggest_intent_data");
          if (str3 != null)
            return str3;
        }
      }
      while (!this.qP.shouldRewriteQueryFromText());
      str2 = a(paramCursor, "suggest_text_1");
    }
    while (str2 == null);
    return str2;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      View localView2 = super.getView(paramInt, paramView, paramViewGroup);
      return localView2;
    }
    catch (RuntimeException localRuntimeException)
    {
      View localView1 = newView(this.mContext, this.fW, paramViewGroup);
      if (localView1 != null)
        ((r)localView1.getTag()).Km.setText(localRuntimeException.toString());
      return localView1;
    }
  }

  public final boolean hasStableIds()
  {
    return false;
  }

  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = super.newView(paramContext, paramCursor, paramViewGroup);
    localView.setTag(new r(localView));
    return localView;
  }

  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    a(getCursor());
  }

  public final void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    a(getCursor());
  }

  public final void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if ((localObject instanceof CharSequence))
      this.Kc.i((CharSequence)localObject);
  }

  public final Cursor runQueryOnBackgroundThread(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    for (String str1 = ""; (this.Kc.getVisibility() != 0) || (this.Kc.getWindowVisibility() != 0); str1 = paramCharSequence.toString())
      return null;
    try
    {
      SearchableInfo localSearchableInfo = this.qP;
      Cursor localCursor;
      if (localSearchableInfo == null)
        localCursor = null;
      while (localCursor != null)
      {
        localCursor.getCount();
        return localCursor;
        String str2 = localSearchableInfo.getSuggestAuthority();
        if (str2 == null)
        {
          localCursor = null;
        }
        else
        {
          Uri.Builder localBuilder = new Uri.Builder().scheme("content").authority(str2).query("").fragment("");
          String str3 = localSearchableInfo.getSuggestPath();
          if (str3 != null)
            localBuilder.appendEncodedPath(str3);
          localBuilder.appendPath("search_suggest_query");
          String str4 = localSearchableInfo.getSuggestSelection();
          if (str4 != null);
          for (String[] arrayOfString = { str1 }; ; arrayOfString = null)
          {
            localBuilder.appendQueryParameter("limit", "50");
            Uri localUri = localBuilder.build();
            localCursor = this.mContext.getContentResolver().query(localUri, null, str4, arrayOfString, null);
            break;
            localBuilder.appendPath(str1);
          }
        }
      }
    }
    catch (RuntimeException localRuntimeException)
    {
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.q
 * JD-Core Version:    0.6.2
 */