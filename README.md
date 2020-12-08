# FlycoTabLayout

fork from  https://github.com/H07000223/FlycoTabLayout

#### [以前的版本](https://github.com/SheTieJun/FlycoTabLayout/blob/master/OLD_README.md)


## Change Log
 >1.  [Update] 迁移Android X + Kotlin
> 2.  [Add]  tl_textSelectSize 添加选中文字大小
> 3.  [Fix]  第一次的是默认选中第一个的时候没有加粗

 
## Gradle
Step 1.  Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
        }
}
```
Step 2. Add the dependency
```
dependencies {
    implementation 'com.github.SheTieJun:FlycoTabLayout:e94fe40702'
}
```
Step 3.use it
```
<com.flyco.tablayout.SlidingTabLayout
     android:id="@+id/tl_5"
     android:layout_width="match_parent"
     android:layout_height="48dp"
     tl:tl_textSelectSize = "16sp"
     android:background="#F6CE59"
     tl:tl_indicator_width="10dp"/>
```


## Attributes

| name                           | format    | description                                                  |
| ------------------------------ | --------- | ------------------------------------------------------------ |
| tl_indicator_color             | color     | 设置显示器颜色                                               |
| tl_indicator_height            | dimension | 设置显示器高度                                               |
| tl_indicator_width             | dimension | 设置显示器固定宽度                                           |
| tl_indicator_margin_left       | dimension | 设置显示器margin,当indicator_width大于0,无效                 |
| tl_indicator_margin_top        | dimension | 设置显示器margin,当indicator_width大于0,无效                 |
| tl_indicator_margin_right      | dimension | 设置显示器margin,当indicator_width大于0,无效                 |
| tl_indicator_margin_bottom     | dimension | 设置显示器margin,当indicator_width大于0,无效                 |
| tl_indicator_corner_radius     | dimension | 设置显示器圆角弧度                                           |
| tl_indicator_gravity           | enum      | 设置显示器上方(TOP)还是下方(BOTTOM),只对常规显示器有用       |
| tl_indicator_style             | enum      | 设置显示器为常规(NORMAL)或三角形(TRIANGLE)或背景色块(BLOCK)  |
| tl_underline_color             | color     | 设置下划线颜色                                               |
| tl_underline_height            | dimension | 设置下划线高度                                               |
| tl_underline_gravity           | enum      | 设置下划线上方(TOP)还是下方(BOTTOM)                          |
| tl_divider_color               | color     | 设置分割线颜色                                               |
| tl_divider_width               | dimension | 设置分割线宽度                                               |
| tl_divider_padding             | dimension | 设置分割线的paddingTop和paddingBottom                        |
| tl_tab_padding                 | dimension | 设置tab的paddingLeft和paddingRight                           |
| tl_tab_space_equal             | boolean   | 设置tab大小等分                                              |
| tl_tab_width                   | dimension | 设置tab固定大小                                              |
| tl_textSelectSize              | dimension | 设置选中字体大小                                             |
| tl_textsize                    | dimension | 设置字体大小                                                 |
| tl_textSelectColor             | color     | 设置字体选中颜色                                             |
| tl_textUnselectColor           | color     | 设置字体未选中颜色                                           |
| tl_textBold                    | boolean   | 设置字体加粗                                                 |
| tl_iconWidth                   | dimension | 设置icon宽度(仅支持CommonTabLayout)                          |
| tl_iconHeight                  | dimension | 设置icon高度(仅支持CommonTabLayout)                          |
| tl_iconVisible                 | boolean   | 设置icon是否可见(仅支持CommonTabLayout)                      |
| tl_iconGravity                 | enum      | 设置icon显示位置,对应Gravity中常量值,左上右下(仅支持CommonTabLayout) |
| tl_iconMargin                  | dimension | 设置icon与文字间距(仅支持CommonTabLayout)                    |
| tl_indicator_anim_enable       | boolean   | 设置显示器支持动画(only for CommonTabLayout)                 |
| tl_indicator_anim_duration     | integer   | 设置显示器动画时间(only for CommonTabLayout)                 |
| tl_indicator_bounce_enable     | boolean   | 设置显示器支持动画回弹效果(only for CommonTabLayout)         |
| tl_indicator_width_equal_title | boolean   | 设置显示器与标题一样长(only for SlidingTabLayout)            |


