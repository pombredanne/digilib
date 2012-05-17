#!/bin/bash
#
# script for creating PNG icons from icon SVG file

SVGFILE="fullscreen2.svg"
XSLTFILE="fullscreen_icons.xsl"
SVGDIR="fullscreen/svg"
# PNG directory relative to SVGDIR
PNGDIR="32"

# run XSLT to create separate SVG files (in fullscreen/svg)
SAXON="java -jar /Volumes/Schlachteplatte/stuff/java/lib/saxonb9-1-0-7j/saxon9.jar"
echo "running Saxon to create separate SVGs"
mkdir -p $SVGDIR
$SAXON $SVGFILE $XSLTFILE

# create PNGs from separate SVGs using inkscape
INKSCAPE=" /Volumes/Schlachteplatte/Applications/Inkscape.app/Contents/Resources/bin/inkscape"
echo "running Inkscape to create PNGs"
cd $SVGDIR
mkdir -p $PNGDIR
ls *.svg | while read fx
do 
    f=`basename "$fx" svg`
    $INKSCAPE --file="$fx" --export-area-drawing --export-width=32 --export-png="$PNGDIR/${f}png"
done
echo "done."