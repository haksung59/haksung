//
//  PractiveUIMemoApp.swift
//  PractiveUIMemo
//
//  Created by haksung on 2022/10/27.
//

import SwiftUI

@main
struct PractiveUIMemoApp: App {
    let persistenceController = PersistenceController.shared

    var body: some Scene {
        WindowGroup {
            MemoListScene()
                .environment(\.managedObjectContext, persistenceController.container.viewContext)
        }
    }
}
