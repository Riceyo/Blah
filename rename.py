import os
import shutil

dl_path = 'N:\\downloads\\'
dupe_count = 1
file_ext_list = [
    'mp4',
    'mkv',
    'wmv',
    'avi',
    'mov',
    'srt',
    ]
    
for (root, dirs, files) in os.walk(dl_path):
    for file in files:
        if root != dl_path:
            file_ext = \
                os.path.splitext(os.path.basename(file))[1].lower()
            for file_ext_loop in file_ext_list:
                if file_ext == '.' + file_ext_loop:
                    src_path = os.path.join(root, file)
                    dest_path = os.path.join(dl_path, file)
                    dest_path_dupe = os.path.join(dl_path, 
                        str(dupe_count) + ' ' + file)
                    if os.path.exists(dest_path):
                        os.rename(src_path, dest_path_dupe)
                        dupe_count = dupe_count + 1
                    else:
                        os.rename(src_path, dest_path)

remain_folders = next(os.walk('.'))[1]

for folder in remain_folders:
    shutil.rmtree(dl_path + folder)

replace_list = (
    '.',
    ',',
    '-',
    '_',
    '(',
    ')',
    '[',
    ']',
    '{',
    '}',
    '1080p',
    '720p',
    '480p',
    'brrip',
    'hdrip',
    'webrip',
    'dvdrip',
    'dvdscr',
    'hdtv',
    'h264',
    'x265',
    'xvid',
    'ac3',
    '800mb',
    '900mb',
    'rarbg',
    'bdrip',
    'yts',
    'avs',
    'lol',
    'sva',
    'web dl',
    'hexdl com',
    'katmoviehd net',
    'msd',
    'afg',
    'web tbs',
    'nf tvstation in',
    'x264',
    'batv',
    'ettv',
    'webtube',
    'hevc',
    'megusta',
    'qpel',
    'mkvcage',
    'etrg',
    'bluray',
    'yify',
    'aac',
    'aldi',
    'hc',
    'evo',
    'eztv',
    'galaxyrg',
    '2010',
    '2011',
    '2012',
    '2013',
    '2014',
    '2015',
    '2016',
    '2017',
    '2018',
    '2019',
    '2020',
    'amzn ddp5 1 h 264 ntb',
    'killers',
    'pbs',
    'web tbs',
    'web memento',
    'minx',
    'mx',
    '5 1',
    'amzn',
    'galaxytv',
    )
files_list = os.listdir(dl_path)

for orig_file in files_list:
    file_base = \
        os.path.splitext(os.path.basename(orig_file))[0].lower()
    file_ext = \
        os.path.splitext(os.path.basename(orig_file))[1].lower()
    for replace_loop in replace_list:
        file_base = file_base.replace(replace_loop, ' ')
    file_base = ' '.join(file_base.split()).strip()
    file_ext = file_ext.lower()
    src_path = os.path.join(dl_path, orig_file)
    dest_path = os.path.join(dl_path, file_base + file_ext)
    os.rename(src_path, dest_path)
